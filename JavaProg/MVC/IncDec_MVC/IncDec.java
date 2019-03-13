public class IncDec {
  public static void main (String arg[]){
     Modelo modelo = new Modelo();
     Controlador controlador = new Controlador(modelo);
     Vista vista = new Vista (modelo, controlador);
  }
}