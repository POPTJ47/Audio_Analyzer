/**
 * This class shows the waveform of the selected file.
 */

package Processing;



import GUI.SampleGUI;
import com.musicg.wave.Wave;
import com.musicg.wave.WaveFileManager;

/**
 *
 * @author Piraveen Mahesan
 */

public class ShowGraphPressed {
    private SampleGUI form;
    
    public void ShowingGraph(SampleGUI form){
        
        this.form = form;
        
        String filename = SampleGUI.getAddress;
        System.out.println(filename);
        String outFolder="out";
        
        // create a wave object
        Wave wave = new Wave(filename);
        
        // print the wave header and info
        System.out.println(wave);
                
        // TimeDomainRepresentations
        com.musicg.wave.extension.Spectrogram spectrogram=new com.musicg.wave.extension.Spectrogram(wave);
        
        // get the amplitude
        double[] amplitudes=wave.getNormalizedAmplitudes();
        
        // Graphic render
        GraphicRender render=new GraphicRender();
        render.setHorizontalMarker(1);
        render.setVerticalMarker(1);
        render.renderWaveform(wave, outFolder+"/waveform.jpg");
        render.renderSpectrogram(spectrogram, outFolder+"/spectrogram.jpg");
        
        // change the amplitude representation
        float timeStep=0.1F;
        
        // change the spectrogram representation
        int fftSampleSize=512;
        int overlapFactor=2;
        spectrogram=new com.musicg.wave.extension.Spectrogram(wave,fftSampleSize,overlapFactor);
                      
        // save the trimmed wav
        WaveFileManager waveFileManager=new WaveFileManager(wave);
        waveFileManager.saveWaveAsFile(outFolder+"/out.wav");
        
        System.out.println("Graph shown");
        
    }
}



