/**
 * This class creates a chart(waveform) without background sound and 
 * displays it to the user.
 */

package Processing;


import GUI.*;
import GUI.SampleGUI;
import com.musicg.wave.Wave;
import com.musicg.wave.WaveFileManager;

/**
 * @author Piraveen Mahesan
 * 
 */

public class NoiseRemovePressed {
    private SampleGUI form;
    
 /**
 * This method selects a file from the 'Signal-Processing' sub-system's 
 * removed noise file and places it in another folder
 */
    
    public void NoiceRemoving(SampleGUI form){
       
        this.form = form;
        
        String filename = SampleGUI.getAddress; 
        String filepath = "out1\\output.wav";
        String outFolder="out";
        
        // create a wave object
        Wave wave = new Wave(filepath);
        
        // print the wave header and info
        System.out.println(wave);
        
        // TimeDomainRepresentations
        com.musicg.wave.extension.Spectrogram spectrogram = new com.musicg.wave.extension.Spectrogram(wave);
        
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
        
        System.out.println("Graph shown");
        
    }
    public void undoNoiceRemoving(){
        
        System.out.println("Noise Removed undone");
    }
}
