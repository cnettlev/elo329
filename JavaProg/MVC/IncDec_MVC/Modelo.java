public class Modelo {
  private int valor;
  private Vista vista;

  public Modelo () {
    valor = 0;
  }
  public int obtenerValor() {
    return valor;
  }
  public void actualizaValor(int nuevo){
     valor = nuevo;
     vista.actualizarVista(this);
  }
  public void registrarVista(Vista vista) {
    this.vista=vista;
  } 
 }