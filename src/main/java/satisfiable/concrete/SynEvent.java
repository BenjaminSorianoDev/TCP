package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class SynEvent implements Satisfiable{

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
    public boolean isSatisfied(Context aContexte) {
        return false;
    }
}
