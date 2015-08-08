/*
 * @author Piraveen Mahesan
 */
package GUI;
import java.beans.XMLDecoder;
import java.awt.Font;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JLabel;
import java.io.Serializable;
import java.util.Random;
import sun.audio.AudioStream;

public class PlayAudioBean implements Serializable {
private File filename;  
private InputStream inn;
private AudioStream audio;

public PlayAudioBean(){}  
  
public void setFilename(File filename){this.filename=filename;}  
  
public File getFilename(){return filename;}  
  
public void setInn(InputStream inn){this.inn=inn;}  
  
public InputStream getInn(){return inn;}  
  
public void setAudio(AudioStream audio){this.audio=audio;}  
  
public AudioStream getAudio(){return audio;}
}

