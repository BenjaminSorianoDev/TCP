package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * Checks whether the condition ... is satisfied.
 * @author BSo
 **/
public final class AbortEvent implements Satisfiable {

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
    public boolean isSatisfied(Context aContexte) {
       // aContexte.getaTCPServer().
        // TODO
        return true;
    }
}
