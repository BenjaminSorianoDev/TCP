package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.Event;
import main.java.satisfiable.Satisfiable;

/**
 * Checks whether the condition ... is satisfied.
 * @author BSo
 **/
public final class AbortEvent implements Satisfiable {

    private static final String EVENT_ABORT = "Abort" ;
    //Event's section
    private final Event abort = new Event(EVENT_ABORT);

    public static volatile AbortEvent instance = null;

    private AbortEvent(){}

    public final static AbortEvent getInstance(){
        if (AbortEvent.instance == null) {
            synchronized(AbortEvent.class) {
                if (AbortEvent.instance == null) {
                    AbortEvent.instance = new AbortEvent();
                }
            }
        }
        return AbortEvent.instance;
    }
    @Override
    public boolean isSatisfied(Context aContext) {
        for(Event event : aContext.getCmdA()) {
            if (event.is(abort)){
                return true;
            }
        }
        return false;
    }
}
