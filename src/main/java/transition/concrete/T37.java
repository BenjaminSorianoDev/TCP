package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T37 extends AbstractTransition {
    /**
     *
     */
    public static volatile T37 instance = null;

    private T37(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAbortEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        // TODO
        //this.setNextState();
    }

    public final static T37 getInstance(Context aContext){
        if (T37.instance == null) {
            synchronized(T37.class) {
                if (T37.instance == null) {
                    T37.instance = new T37(aContext);
                }
            }
        }
        return T37.instance;
    }
}
