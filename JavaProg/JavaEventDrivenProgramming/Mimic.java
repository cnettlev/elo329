import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 

public class Mimic extends JFrame { 
  MimicGUI gui = new MimicGUI(); 
  public Mimic() { 
    setTitle("Mimic"); 
    setSize( 250, 100);
      // fast way to setup closeable window listener object 
    addWindowListener( new WindowAdapter() { /* Clase anónima */
          public void windowClosing( WindowEvent e) {  
            System. exit( 0); 
          } 
         }
    ); 
    getContentPane().add(gui); 
    setVisible(true); 
  } 
  public static void main( String[] args) { 
    Mimic mimic = new Mimic();    
  } 
} 

class MimicGUI extends JPanel { // panel: parte interna de la ventana
  private JLabel label = new JLabel(" Echo appears here"); 
  private JTextField quote = new JTextField( 20); 
  private MimicListener listener = new MimicListener( this); 

  public MimicGUI() {
    // add quote and label to window 
    add(quote); 
    add(label);
    // register listener with quote object 
    quote.addActionListener(listener); 
  } 

  public void updateLabel() { 
    label.setText(quote.getText()); 
  } 
}

class MimicListener implements ActionListener { 
  private MimicGUI gui; 
  public MimicListener( MimicGUI guiref) { 
    gui = guiref; 
  } 
  // method required by action listener interface 
  public void actionPerformed( ActionEvent e) { 
    gui.updateLabel(); 
  } 
}
