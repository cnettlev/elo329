public class Inicializacion {
  public Inicializacion(){
    System.out.println("En constructor basico");
  }
  public Inicializacion(String s) {
    System.out.println("En constructor con string: "+s);
  }
  {
   System.out.println("En bloque de inicializacion");
  }
  static {
    System.out.println("En bloque de inicializacion static");
  }
  public static void main(String argv[]){
    System.out.println("Primera linea de codigo del main");
    Inicializacion a[] = {new Inicializacion(), new Inicializacion("elo329")};
  }
}      