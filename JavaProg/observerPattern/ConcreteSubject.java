/* File Name : EventSource.java */

import java.util.Observable;          //Observable is here
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
public class ConcreteSubject extends Observable implements Runnable 
{
    public void run() {
        try {   
            final InputStreamReader isr = new InputStreamReader( System.in );
            final BufferedReader br = new BufferedReader( isr );
            while( true ) {
                response = br.readLine();
                setChanged();
                notifyObservers();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
  public String getState(){
    return response;
  }
  
  private String response; 
}
