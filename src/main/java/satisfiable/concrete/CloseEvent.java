package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class CloseEvent implements Satisfiable {

    public static volatile CloseEvent instance = null;

    private CloseEvent(){}

    public final static CloseEvent getInstance(){
        if (CloseEvent.instance == null) {
            synchronized(CloseEvent.class) {
                if (CloseEvent.instance == null) {
                    CloseEvent.instance = new CloseEvent();
                }
            }
        }
        return CloseEvent.instance;
    }
    @Override
    public boolean isSatisfied(Context aContexte) {
        return false;
    }
}
