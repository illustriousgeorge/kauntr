package cz.illgee.counter.managers;
import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

@ApplicationScoped

public class Manager implements Serializable {
    private int counter = 0;
    public int getCounter() {
        return counter;
    }
    public void increment() {
        counter++;
    }
    public void decrement() {
        counter--;
    }
}
