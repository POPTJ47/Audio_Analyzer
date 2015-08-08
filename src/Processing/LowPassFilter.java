/**
 *
 * This is the class which removes noise from the selected files uploaded by the user.
 * This was implemented by the 'Signal Processing' sub-system and was integrated successfully.
 */

package Processing;


import GUI.SampleGUI;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.TargetDataLine;
import javax.sound.sampled.UnsupportedAudioFileException;
import edu.emory.mathcs.jtransforms.fft.DoubleFFT_1D;

/**
 *
 * @author Piraveen Mahesan
 */

public class LowPassFilter implements Runnable {
    
    public final static int SAMPLERATE = 48000;
    public final static int BUFFERSIZE = SAMPLERATE * 2;
    public final static int FFTRES = 512;
    
    public TargetDataLine tdl;
    public DoubleFFT_1D fft;
    public byte[] audioBytes;
    public ByteArrayOutputStream baos;
    public ByteArrayOutputStream baosO;// this will store sound data
    public double[] filter, filterFFT, audio, audioFFT, audioOverlap,
            audioFiltered;
    public String wavPath = SampleGUI.getAddress;
    
    
    public double sinc(double x) {
        if (x == 0)
            return 1;
        return Math.sin(Math.PI * x) / (Math.PI * x);
    }
    
    LowPassFilter(TargetDataLine tdl) {
        audio = new double[FFTRES / 2];
        filter = new double[FFTRES / 2 + 1];
        audioFFT = new double[FFTRES * 2]; // *2 because FFT data has both real
        // and imaginary parts
        filterFFT = new double[FFTRES * 2];
        audioOverlap = new double[FFTRES / 2];
        audioFiltered = new double[FFTRES / 2];
        
        this.tdl = tdl;
        audioBytes = new byte[audio.length * 2];
        baos = new ByteArrayOutputStream();
        baosO = new ByteArrayOutputStream();
        fft = new DoubleFFT_1D(FFTRES);
        System.out.println("FFT resolution: " + FFTRES);
        System.out.println("Audio sample in buffer length: " + audio.length);
        System.out.println("Filter length: " + filter.length);
        
        // designing the windowed sinc filter
        int cutFreq = 1000;
        for (int i = 0; i < filter.length - 1; i++) {
                   double sincFilter = (2 * cutFreq / (double) SAMPLERATE)
                    * sinc(2 * cutFreq * (i - ((filter.length - 1) / 2.0))
                    / (double) SAMPLERATE);
            
            filter[i] = (0.42 - 0.5 * Math.cos((2 * Math.PI * i)
                    / (double) (filter.length - 1)) + 0.08 * Math
                    .cos((4 * Math.PI * i) / (double) (filter.length - 1)))
                    * sincFilter;
        }
               
        // clearing the audio overlap buffer
        for (int i = 0; i < audioOverlap.length; i++)
            audioOverlap[i] = 0;
        
        // clearing the FFT buffer
        for (int i = 0; i < filterFFT.length; i++)
            filterFFT[i] = 0;
        
        // copying time domain filter data to the FFT buffer
        for (int i = 0; i < filter.length; i++)
            filterFFT[2 * i] = filter[i];
        
        fft.complexForward(filterFFT);
    }
    
    // converts float array to byte array
    public byte[] getBytesFromDoubles(final double[] audioData,
            final int storedSamples) {
        byte[] audioDataBytes = new byte[storedSamples * 2];
        
        for (int i = 0; i < storedSamples; i++) {
            // saturation
            audioData[i] = Math.min(1.0, Math.max(-1.0, audioData[i]));
            
            // scaling and conversion to integer
            int sample = (int) Math.round((audioData[i] + 1.0) * 32767.5) - 32768;
            
            byte high = (byte) ((sample >> 8) & 0xFF);
            byte low = (byte) (sample & 0xFF);
            audioDataBytes[i * 2] = low;
            audioDataBytes[i * 2 + 1] = high;
        }
        
        return audioDataBytes;
    }
    
    // saves the audio data given in audioDataBytes to a .wav file
    public void writeWavFile(final byte[] audioDataBytes,
            final int storedSamples, final String fileName) {
        AudioFormat audioFormat = new AudioFormat(
                AudioFormat.Encoding.PCM_SIGNED, SAMPLERATE, 16, 1, 2,
                SAMPLERATE, false);
        AudioInputStream audioInputStream = new AudioInputStream(
                new ByteArrayInputStream(audioDataBytes), audioFormat,
                storedSamples);
        
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            AudioSystem.write(audioInputStream, AudioFileFormat.Type.WAVE,
                    fileOutputStream);
            audioInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void lowPassFilter(double[] audioDataIn, double[] audioDataOut) {
        // zeroing out the audio FFT buffer
        for (int i = 0; i < audioFFT.length; i++)
            audioFFT[i] = 0;
        // copying audio data to the FFT data buffer
        for (int i = 0; i < audioDataIn.length; i++)
            audioFFT[2 * i] = audioDataIn[i];
        
        // calculating the fft of the data
        fft.complexForward(audioFFT);
        
        // pointwise multiplication of the filter and audio data in the
        // frequency domain
        for (int i = 0; i < filterFFT.length; i += 2) {
            double temp = audioFFT[i] * filterFFT[i] - audioFFT[i + 1]
                    * filterFFT[i + 1];
            audioFFT[i + 1] = audioFFT[i] * filterFFT[i + 1] + audioFFT[i + 1]
                    * filterFFT[i]; // imaginary part
            audioFFT[i] = temp; // real part
        }
        
        // built-in scaling hangs the thread, so we don't use it
        fft.complexInverse(audioFFT, false);
        
        // adding the first half of the audio FFT buffer to the overlap buffer
        for (int i = 0; i < audioDataOut.length; i++)
            audioDataOut[i] = (audioOverlap[i] + audioFFT[i * 2]) / 2000; // applying
        // scaling
        
        // copying the second half of the audio FFT buffer to the audio overlap
        // buffer
        for (int i = 0; i < audioOverlap.length; i++)
            audioOverlap[i] = audioFFT[audioFFT.length / 2 + i * 2];
    }
    
    @Override
    public void run() {
        tdl.start();
        
        try {
            while (!Thread.interrupted()) {
                // waiting for the buffer to get filled
                while (tdl.available() < audioBytes.length)
                    Thread.sleep(0, 1); 
                
                int bytesRead = tdl.read(audioBytes, 0, audioBytes.length);
                
                // converting frames stored as bytes to double values
                int samplesRead = bytesRead / 2;
                for (int i = 0; i < samplesRead; i++)
                    audio[i] = ((audioBytes[i * 2] & 0xFF) | (audioBytes[i * 2 + 1] << 8)) / 32768.0;
                baosO.write(getBytesFromDoubles(audio, audio.length), 0,
                        audio.length * 2);
                lowPassFilter(audio, audioFiltered);
                baos.write(
                        getBytesFromDoubles(audioFiltered, audioFiltered.length),
                        0, audioFiltered.length * 2);
            }
        } catch (InterruptedException e) {
        }
        
        tdl.stop();
        tdl.close();
        
        writeWavFile(baosO.toByteArray(), baosO.size() / 2, "out1\\output_0.wav");
        writeWavFile(baos.toByteArray(), baos.size() / 2, "out1\\output.wav");
    }
    
    
    
    public void transformSignal() throws UnsupportedAudioFileException,
            IOException {
        
        File soundFile = new File(wavPath);
        AudioInputStream audioStream = null;
        
        audioStream = AudioSystem.getAudioInputStream(soundFile);
        
        int bytesRead = 0;
        
        while (bytesRead != -1) {
            try {
                bytesRead = audioStream.read(audioBytes, 0, audioBytes.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (bytesRead >= 0) {
                
                int samplesRead = bytesRead / 2;
                for (int i = 0; i < samplesRead; i++)
                    audio[i] = ((audioBytes[i * 2] & 0xFF) | (audioBytes[i * 2 + 1] << 8)) / 32768.0;
                
                baosO.write(getBytesFromDoubles(audio, audio.length), 0,
                        audio.length * 2);
                
                lowPassFilter(audio, audioFiltered);
                baos.write(
                        getBytesFromDoubles(audioFiltered, audioFiltered.length),
                        0, audioFiltered.length * 2);
            }
        }
        
        writeWavFile(baosO.toByteArray(), baosO.size() / 2, "out1\\output_o.wav");
        writeWavFile(baos.toByteArray(), baos.size() / 2, "out1\\output.wav");
    }
}
