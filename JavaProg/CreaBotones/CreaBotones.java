/**
   @version 1.0 02-04-2008
   @author Agustin J. Gonzalez
   Ilustra una uso posible de Layout Manager
   Este programa una adaptacion de pregunta de un certamen del 1s07.
   Se pide crear una aplicacion Java que muestre un boton con nombre "Crear boton".
   Cuando este es presionado, se incorpora un segundo boton igual al primero.
   Cuando se presiona cualquiera de los dos, se crea un tercer boton igual
   a los anteriores. Este comportamiento se repite para todo boton creado.
   La aplicacion termina cuando presionamos el boton de cierre de la esquina
   superior derecha de la ventana.
*/
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class CreaBotones
{
  public static void main(String[] args)
  {
    CreaBotonesFrame frame = new CreaBotonesFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
  }
}
class CreaBotonesFrame extends JFrame
{
  public CreaBotonesFrame()
  {
    setTitle("Crea Botones");
    setSize(250, 150);
    CreaBotonesPanel panel = new CreaBotonesPanel();
    panel.setPreferredSize(new Dimension(250,150));  // to let Scroll Bar know
                                                     // when to add the scroll bars.
      // Another way is to define an adequate layout.
      // as in
      // panel.setLayout(new GridLayout(0,2));  // requires size definition
      // for each component added to the Grid.
    JScrollPane sp = new JScrollPane(panel); // place the panel within scrollpane.
    Container contentPane = getContentPane();
    contentPane.add(sp);
  }
}
class CreaBotonesPanel extends JPanel
{
  public CreaBotonesPanel()
  {
    creaBoton();
  }
  private void creaBoton() 
  {
    JButton boton = new JButton("Crea Boton");
    boton.addActionListener( new ActionListener (){
       public void actionPerformed(ActionEvent event) {
         creaBoton();
       };
      });
    
    add(boton);
    validate(); // debe ir, pero no descuenta puntos en certamen.
  /* The validate method is used to cause a container to lay
     out its subcomponents again. It should be invoked when
     this container's subcomponents are modified (added to
     or removed from the container, or layout-related information
     changed) after the container has been displayed.
  */
  }
}
