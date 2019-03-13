import java.awt.event.*;
import javax.swing.*;

class CloseableFrame extends JFrame { 
  public CloseableFrame() { 
    setTitle("My Closeable Frame"); 
    setSize( 300, 200); 
    // cause window events to be sent to window listener object 
    MyWindowListener listener=new MyWindowListener();
    addWindowListener(listener); 
  } 
} 

class MyWindowListener implements WindowListener { 
  // Do nothing methods required by interface 
  public void windowActivated( WindowEvent e) {} 
  public void windowDeactivated( WindowEvent e) {} 
  public void windowIconified( WindowEvent e) {} 
  public void windowDeiconified( WindowEvent e) {} 
  public void windowOpened( WindowEvent e) {} 
  public void windowClosed( WindowEvent e) {} 
  
  // override windowClosing method to exit program 
  public void windowClosing( WindowEvent e) {
    System.exit( 0); // normal exit 
  } 
} 

class Main { 
  public static void main( String[] args) { 
    CloseableFrame f = new CloseableFrame(); 
    f.setVisible(true); // makes the frame visible 
    new CloseableFrame().setVisible(true);
    f.setTitle("ELO329");
  } 
}
