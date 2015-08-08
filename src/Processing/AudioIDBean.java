/*
 * @author Piraveen Mahesan
 */
package Processing;
import java.beans.XMLDecoder;
import java.awt.Font;
import javax.swing.JLabel;
import java.io.Serializable;
import java.util.Random;

public class AudioIDBean implements Serializable {
private Random random;  
private int num;  
  
public AudioIDBean(){}  
  
public void setRandom(Random id){this.random=random;}  
  
public Random getRandom(){return random;}  
  
public void setNum(int num){this.num=num;}  
  
public int getNum(){return num;}  
  

}

