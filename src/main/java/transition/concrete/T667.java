package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T667 extends AbstractTransition {
    /**
     *
     */
    public static volatile T667 instance = null;

    private T667(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAbortEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        // TODO
        //this.setNextState();
    }

    public final static T667 getInstance(Context aContext){
        if (T667.instance == null) {
            synchronized(T667.class) {
                if (T667.instance == null) {
                    T667.instance = new T667(aContext);
                }
            }
        }
        return T667.instance;
    }
}
