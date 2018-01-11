package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.Event;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class ResetEvent implements Satisfiable {

    private static final String EVENT_RST = "Rst" ;
    //Event's section
    private final Event rst = new Event(EVENT_RST);

    public static volatile ResetEvent instance = null;

    private ResetEvent(){}

    public final static ResetEvent getInstance(){
        if (ResetEvent.instance == null) {
            synchronized(ResetEvent.class) {
                if (ResetEvent.instance == null) {
                    ResetEvent.instance = new ResetEvent();
                }
            }
        }
        return ResetEvent.instance;
    }
    @Override
    public boolean isSatisfied(Context aContext) {
        for(Event event : aContext.getTpcMsgC()) {
            if (event.is(rst)){
                return true;
            }
        }
        return false;
    }
}
