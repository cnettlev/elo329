/**
   @version 1.20 26 Jun 1998
   @author Cay Horstmann
*/

/*
  <APPLET CODE="NotHelloWorldApplet.class" WIDTH=300 HEIGHT=100>
  </APPLET>
*/

import java.awt.*;
import javax.swing.*;

public class NotHelloWorldApplet extends JApplet
{
   public void init()
   {
      Container contentPane = getContentPane();
      JLabel label = new JLabel("ELO329,  World applet. BIEN!!!",
         SwingConstants.CENTER);
      contentPane.add(label);
   }
}
