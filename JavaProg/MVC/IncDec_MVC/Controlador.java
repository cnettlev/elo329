import java.awt.event.*;
import java.awt.*;

public class Controlador implements ActionListener {
  private Modelo modelo;
  public Controlador (Modelo modelo) {
    this.modelo = modelo;
  }
  public void actionPerformed(ActionEvent event) {
   int valor = modelo.obtenerValor();   
   if(event.getActionCommand().equals("Incrementa"))
     valor++; 
   else
     valor--;  
   modelo.actualizaValor(valor);
  }
}
