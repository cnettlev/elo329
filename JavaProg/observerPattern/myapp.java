/* Filename : myapp.java */
/* This is main program */
 
 
public class myapp
{
    public static void main(String args[]) {            
        System.out.println("Enter Text >");
 
        // create an event source - reads from stdin
        final ConcreteSubject evSrc = new ConcreteSubject();
 
        // create an observer
        final ConcreteObserver respHandler = new ConcreteObserver();
 
        // subscribe the observer to the event source
        evSrc.addObserver( respHandler );
 
        // starts the event thread
        Thread thread = new Thread(evSrc);
        thread.start();
    }
}
