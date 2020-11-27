
package lab5;

import javafx.event.Event;
import javafx.event.EventHandler;

public class myOuterHandler implements EventHandler {

    @Override
    public void handle(Event event) {
        System.out.println("Outer handler says hello");
    }
   
}
