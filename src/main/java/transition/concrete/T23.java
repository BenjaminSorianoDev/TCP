package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T23 extends AbstractTransition {
    /**
     *
     */
    public static volatile T23 instance = null;

    private T23(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAckEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionWriteFinalMessage());
        this.setNextState(aContext.getaConcreteFactory().createState3());
    }

    public final static T23 getInstance(Context aContext){
        if (T23.instance == null) {
            synchronized(T23.class) {
                if (T23.instance == null) {
                    T23.instance = new T23(aContext);
                }
            }
        }
        return T23.instance;
    }
}
