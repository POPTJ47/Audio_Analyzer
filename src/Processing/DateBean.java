/*
 * @author Piraveen Mahesan
 */
package Processing;
import java.beans.XMLDecoder;
import java.awt.Font;
import javax.swing.JLabel;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.Random;

public class DateBean extends JLabel implements Serializable {
private DateFormat df;  
private Calendar cal;  
  
public DateBean(){}  
  
public void setDf(DateFormat df){this.df=df;}  
  
public DateFormat getDf(){return df;}  
  
public void setCal(Calendar cal){this.cal=cal;}  
  
public Calendar getCal(){return cal;}  
  

}

