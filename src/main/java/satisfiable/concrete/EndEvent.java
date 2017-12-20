package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class EndEvent implements Satisfiable {

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
    public boolean isSatisfied(Context aContexte) {
        return false;
    }
}
