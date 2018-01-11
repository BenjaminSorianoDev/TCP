package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.Event;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class SynEvent implements Satisfiable{

    private static final String EVENT_SYN = "Syn" ;
    //Event's section
    private final Event syn = new Event(EVENT_SYN);

    public static volatile SynEvent instance = null;

    private SynEvent(){}

    public final static SynEvent getInstance(){
        if (SynEvent.instance == null) {
            synchronized(SynEvent.class) {
                if (SynEvent.instance == null) {
                    SynEvent.instance = new SynEvent();
                }
            }
        }
        return SynEvent.instance;
    }
    @Override
    public boolean isSatisfied(Context aContext) {
        for(Event event : aContext.getTpcMsgC()) {
            if (event.is(syn)){
                return true;
            }
        }
        return false;
    }
}
