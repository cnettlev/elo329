import javax.swing.*;
import java.awt.*;

public class Vista extends JFrame
{
   private JLabel labelnum;

   public Vista(Modelo modelo, Controlador controlador)   {
      setTitle("Vista Incrementa y Decrementa");
      setSize(300, 140);
      setLayout( new BorderLayout() );
      Panel panel = new Panel();

      labelnum = new JLabel();
      actualizarVista(modelo);
      panel.add(labelnum);
      add( "North",panel);
      panel = new Panel();
      JButton botton = new JButton("Incrementa");
      botton.addActionListener(controlador);
      panel.add(botton);
      botton = new JButton("Decrementa");
      botton.addActionListener(controlador);
      panel.add(botton);
      add( "Center",panel);
      modelo.registrarVista(this);
      setVisible(true); 
   }
   public void actualizarVista(Modelo modelo) {
     labelnum.setText(Integer.toString(modelo.obtenerValor()));
   }
}
      
