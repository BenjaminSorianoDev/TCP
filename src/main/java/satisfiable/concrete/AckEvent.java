package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class AckEvent implements Satisfiable {

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
    public boolean isSatisfied(Context aContexte) {
        return false;
    }
}
