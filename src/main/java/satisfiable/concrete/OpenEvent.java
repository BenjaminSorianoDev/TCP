package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class OpenEvent implements Satisfiable{

    public static volatile OpenEvent instance = null;

    private OpenEvent(){}

    public final static OpenEvent getInstance(){
        if (OpenEvent.instance == null) {
            synchronized(OpenEvent.class) {
                if (OpenEvent.instance == null) {
                    OpenEvent.instance = new OpenEvent();
                }
            }
        }
        return OpenEvent.instance;
    }
    @Override
    public boolean isSatisfied(Context aContext) {
        return false;
    }
}
