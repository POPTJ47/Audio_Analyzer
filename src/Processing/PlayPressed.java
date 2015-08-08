/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processing;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author Piraveen Mahesan
 */
public class PlayPressed {
    public void PlayingFile(){
        JFileChooser flc = new JFileChooser();
     InputStream inn;
        try{
            File Filename = flc.getSelectedFile();
            inn = new FileInputStream(Filename);
            AudioStream audios = new AudioStream(inn);
            AudioPlayer.player.start(audios);
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Please select a sound file to play.");
        }   
    }
}
