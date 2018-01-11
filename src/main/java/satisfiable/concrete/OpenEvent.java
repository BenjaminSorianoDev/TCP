package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.Event;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class OpenEvent implements Satisfiable{

    private static final String EVENT_OPEN= "Open" ;
    //Event's section
    private final Event open = new Event(EVENT_OPEN);

    public static volatile OpenEvent instance = null;

    private OpenEvent(){}

    public final static OpenEvent getInstance(){
        if (OpenEvent.instance == null) {
            synchronized(OpenEvent.class) {
                if (OpenEvent.instance == null) {
                    OpenEvent.instance = new OpenEvent();
                }
            }
        }
        return OpenEvent.instance;
    }
    @Override
    public boolean isSatisfied(Context aContext) {
        for(Event event : aContext.getCmdA()) {
            if (event.is(open)){
                return true;
            }
        }
        return false;
    }
}
