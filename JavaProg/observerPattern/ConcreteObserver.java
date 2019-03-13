/* File Name: ResponseHandler.java */
 
import java.util.Observable;
import java.util.Observer;  /* this is Event Handler */
 
public class ConcreteObserver implements Observer
{
    private ConcreteSubject cs;
    public void update (Observable obj, Object arg)
    {
        if (obj instanceof ConcreteSubject)
        {
            cs = (ConcreteSubject) obj;
            System.out.println("\nReceived Response: "+ cs.getState());
        }
    }
}
