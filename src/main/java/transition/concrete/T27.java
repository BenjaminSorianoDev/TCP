package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T27 extends AbstractTransition {
    /**
     *
     */
    public static volatile T27 instance = null;

    private T27(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAbortEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        this.setNextState(aContext.getaConcreteFactory().createState7());
    }

    public final static T27 getInstance(Context aContext){
        if (T27.instance == null) {
            synchronized(T27.class) {
                if (T27.instance == null) {
                    T27.instance = new T27(aContext);
                }
            }
        }
        return T27.instance;
    }
}
