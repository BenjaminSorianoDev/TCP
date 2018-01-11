package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T56 extends AbstractTransition {
    /**
     *
     */
    public static volatile T56 instance = null;

    private T56(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createTimeOverEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionOnTimer());
        this.setNextState(aContext.getaConcreteFactory().createState6());
    }

    public final static T56 getInstance(Context aContext){
        if (T56.instance == null) {
            synchronized(T56.class) {
                if (T56.instance == null) {
                    T56.instance = new T56(aContext);
                }
            }
        }
        return T56.instance;
    }
}
