import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
public class AppletCreaBotones extends JApplet {
  public void init() {  // cambio
    CreaBotonesPanel panel = new CreaBotonesPanel(getParameter("texto")); //cambio
    Container contentPane = getContentPane();
    contentPane.add(panel);
  }
}
class CreaBotonesPanel extends JPanel {  // cambio parcial
  private String texto;   // nuevo
  public CreaBotonesPanel(String texto){  // cambio
    this.texto = texto;  // nuevo
    creaBoton();
  }
  private void creaBoton() {
    JButton boton = new JButton(texto);
    boton.addActionListener( new ActionListener (){
       public void actionPerformed(ActionEvent event) {
         creaBoton();
       };
      });
    add(boton);
    validate();
  }
}