// Solicita el ingreso de un numero y lo incrementa y decrementa.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IncDecLayout
{
   public static void main(String[] args)
   {  
      IncDecFrame frame = new IncDecFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.setVisible(true);
   }
}

class IncDecFrame extends JFrame implements ActionListener
{
   private JLabel labelnum;
   private int v=0;

   public IncDecFrame()   {
      setTitle("Incrementa y Decrementa");
      setSize(300, 140);
      setLayout( new BorderLayout() );
      Panel panel = new Panel();

      labelnum = new JLabel("0");
      panel.add(labelnum);
      add( "North",panel);
      panel = new Panel();
      JButton botton = new JButton("Incrementa");
      botton.addActionListener(this);
      panel.add(botton);
      botton = new JButton("Decrementa");
      botton.addActionListener(this);
      panel.add(botton);
      add( "Center",panel); 
   }
      
   public void actionPerformed(ActionEvent event) {
      if(event.getActionCommand().equals("Incrementa"))
         v++;  // cambia el modelo
      else
         v--;  // cambia el modelo.   Lo debe hacer el modelo
               // a pedido del controlador
      labelnum.setText(Integer.toString(v));  // actualiza vista
                                          // se espera lo haga la vista
      }
      // en la arquitectura mvc, este cambio lo hace el controlador
      // el cual cambia el modelo. Luego de hacer el cambio al modelo,
      // este debe informar a la vista de un cambio, la cual luego
      // consulta al modelo el cambio para reflejarlo en la vista.
}