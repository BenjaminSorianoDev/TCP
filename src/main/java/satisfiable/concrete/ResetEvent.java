package main.java.satisfiable.concrete;

import com.sun.org.apache.regexp.internal.RE;
import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public final class ResetEvent implements Satisfiable {

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
    public boolean isSatisfied(Context aContexte) {
        return false;
    }
}
