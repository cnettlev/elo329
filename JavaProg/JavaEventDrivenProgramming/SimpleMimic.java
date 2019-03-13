import java.awt.event.*; //WindowAdapter, ActionListener, ActionEvent
import javax.swing.*;  // JFrame, JPanel

public class SimpleMimic extends JFrame { 
  SimpleMimicGUI gui = new SimpleMimicGUI(); // pudo ir en constructor
  public SimpleMimic() { 
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
    SimpleMimic mimic = new SimpleMimic();    
  } 
} 

class SimpleMimicGUI extends JPanel implements ActionListener { 
     // JPanel: parte interna de la ventana JFrame
  private JLabel label = new JLabel(" Echo appears here"); 
  private JTextField quote = new JTextField( 20); 

  public SimpleMimicGUI() {
    // add quote and label to window 
    add(quote); 
    add(label);
    // register listener with quote object 
    quote.addActionListener(this); 
  } 

  public void actionPerformed( ActionEvent e) { 
    label.setText(quote.getText()); 
  } 
}
