import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 

public class MimicCharbyChar extends JFrame { 
  MimicGUICharbyChar gui = new MimicGUICharbyChar(); 
  public MimicCharbyChar() { 
    setTitle("Mimic"); 
    setSize( 250, 100);
 
    // fast way to setup closeable window listener object 
    addWindowListener( new WindowAdapter() {
	public void windowClosing( WindowEvent e) { 
	  System. exit( 0); 
	} 
      }
		       ); 
    getContentPane().add(gui); 
    setVisible(true); 
  } 
  
  public static void main( String[] args) { 
    MimicCharbyChar mimic = new MimicCharbyChar(); 
  } 
} 

class MimicGUICharbyChar extends JPanel { 
  private JLabel label = new JLabel(" Echo appears here"); 
  private JTextField quote = new JTextField( 20); 
  private MimicCharbyCharListener listener = new MimicCharbyCharListener( this); 

  public MimicGUICharbyChar() {
    // add quote and label to window 
    add(quote); 
    add(label);
    // register listener with quote object 
    quote.getDocument().addDocumentListener(listener); 
  } 

  public void updateLabel() { 
    label.setText(quote.getText()); 
  } 
}

class MimicCharbyCharListener implements DocumentListener { 
  private MimicGUICharbyChar gui; 
  public MimicCharbyCharListener( MimicGUICharbyChar guiref) { 
    gui = guiref; 
  } 
  // method required by DocumentListener interface 
  public void insertUpdate(DocumentEvent e) { 
    gui.updateLabel(); 
  } 
  public void removeUpdate(DocumentEvent e) { 
    gui.updateLabel(); 
  } 
  //call when the text format changes. This cannot occur for JTextField.
  public void changedUpdate(DocumentEvent e) { 
  } 
}
