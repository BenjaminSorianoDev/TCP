package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T31 extends AbstractTransition {
    /**
     *
     */
    public static volatile T31 instance = null;

    private T31(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createResetEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionOnAck());
        this.setNextState(aContext.getaConcreteFactory().createState1());
    }

    public final static T31 getInstance(Context aContext){
        if (T31.instance == null) {
            synchronized(T31.class) {
                if (T31.instance == null) {
                    T31.instance = new T31(aContext);
                }
            }
        }
        return T31.instance;
    }
}
