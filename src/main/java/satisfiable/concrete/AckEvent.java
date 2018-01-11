package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.Event;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class AckEvent implements Satisfiable {

    private static final String EVENT_ACK = "Ack" ;
    //Event's section
    private final Event ack = new Event(EVENT_ACK);

    public static volatile AckEvent instance = null;

    private AckEvent(){}

    public final static AckEvent getInstance(){
        if (AckEvent.instance == null) {
            synchronized(AckEvent.class) {
                if (AckEvent.instance == null) {
                    AckEvent.instance = new AckEvent();
                }
            }
        }
        return AckEvent.instance;
    }

    @Override
    public boolean isSatisfied(Context aContext) {

        for(Event event : aContext.getTpcMsgC()) {
            if (event.is(ack)){
                return true;
            }
        }
        return false;
    }
}
