package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class TimeOverEvent implements Satisfiable {

    public static volatile TimeOverEvent instance = null;

    private TimeOverEvent(){}

    public final static TimeOverEvent getInstance(){
        if (TimeOverEvent.instance == null) {
            synchronized(TimeOverEvent.class) {
                if (TimeOverEvent.instance == null) {
                    TimeOverEvent.instance = new TimeOverEvent();
                }
            }
        }
        return TimeOverEvent.instance;
    }
    @Override
    public boolean isSatisfied(Context aContext) {
        if(aContext.isTimeOver())
            return true;
        return false;
    }
}
