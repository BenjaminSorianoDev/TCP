package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T57 extends AbstractTransition {
    /**
     *
     */
    public static volatile T57 instance = null;

    private T57(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAbortEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        this.setNextState(aContext.getaConcreteFactory().createState7());
    }

    public final static T57 getInstance(Context aContext){
        if (T57.instance == null) {
            synchronized(T12.class) {
                if (T57.instance == null) {
                    T57.instance = new T57(aContext);
                }
            }
        }
        return T57.instance;
    }
}
