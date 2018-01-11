package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T610 extends AbstractTransition {
    /**
     *
     */
    public static volatile T610 instance = null;

    private T610(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createEndEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionResetAll());
        this.setNextState(aContext.getaConcreteFactory().createState1());
    }

    public final static T610 getInstance(Context aContext){
        if (T610.instance == null) {
            synchronized(T610.class) {
                if (T610.instance == null) {
                    T610.instance = new T610(aContext);
                }
            }
        }
        return T610.instance;
    }
}
