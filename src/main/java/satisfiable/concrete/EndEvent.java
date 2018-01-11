package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.Event;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class EndEvent implements Satisfiable {

    private static final String EVENT_FIN = "Fin" ;
    //Event's section
    private final Event fin = new Event(EVENT_FIN);

    private static final String EVENT_RST = "Rst" ;
    //Event's section
    private final Event rst = new Event(EVENT_RST);

    public static volatile EndEvent instance = null;

    private EndEvent(){}

    public final static EndEvent getInstance(){
        if (EndEvent.instance == null) {
            synchronized(EndEvent.class) {
                if (EndEvent.instance == null) {
                    EndEvent.instance = new EndEvent();
                }
            }
        }
        return EndEvent.instance;
    }
    @Override
    public boolean isSatisfied(Context aContext) {
        for(Event event : aContext.getTpcMsgC()) {
            if (event.is(fin) || event.is(rst)){
                return true;
            }
        }
        return false;
    }
}
