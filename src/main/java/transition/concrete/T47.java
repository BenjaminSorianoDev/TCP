package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T47 extends AbstractTransition {
    /**
     *
     */
    public static volatile T47 instance = null;

    private T47(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAbortEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        this.setNextState(State7.getInstance(aContext));
    }

    public final static T47 getInstance(Context aContext){
        if (T47.instance == null) {
            synchronized(T47.class) {
                if (T47.instance == null) {
                    T47.instance = new T47(aContext);
                }
            }
        }
        return T47.instance;
    }

}
