/*
 * @author Piraveen Mahesan
 *
 */
package GUI;
import java.beans.XMLDecoder;
import java.awt.Font;
import javax.swing.JLabel;
import java.io.Serializable;

public class LabelBean extends JLabel implements Serializable {
    public LabelBean() {
        setText( "Sound Analyzer" );
        Font font = new Font("Old English Text MT", Font.PLAIN,24);
        setFont(font);
        setHorizontalAlignment( CENTER );
    } 
}

