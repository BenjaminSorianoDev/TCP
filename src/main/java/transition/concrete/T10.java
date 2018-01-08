package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T10 extends AbstractTransition {
    /**
     *
     */
    public static volatile T10 instance = null;

    private T10(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createCloseEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        this.setNextState(State0.getInstance(aContext));
    }

    public final static T10 getInstance(Context aContext){
        if (T10.instance == null) {
            synchronized(T10.class) {
                if (T10.instance == null) {
                    T10.instance = new T10(aContext);
                }
            }
        }
        return T10.instance;
    }
}
