package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T210 extends AbstractTransition {
    /**
     *
     */
    public static volatile T210 instance = null;

    private T210(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createTimeOverEvent());
        this.setAnAction(null);
        // TODO
        //this.setNextState();
    }

    public final static T210 getInstance(Context aContext){
        if (T210.instance == null) {
            synchronized(T210.class) {
                if (T210.instance == null) {
                    T210.instance = new T210(aContext);
                }
            }
        }
        return T210.instance;
    }
}
