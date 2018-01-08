package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T45 extends AbstractTransition {
    /**
     *
     */
    public static volatile T45 instance = null;

    private T45(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAckEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionOnTimer());
        this.setNextState(State5.getInstance(aContext));
    }

    public final static T45 getInstance(Context aContext){
        if (T45.instance == null) {
            synchronized(T45.class) {
                if (T45.instance == null) {
                    T45.instance = new T45(aContext);
                }
            }
        }
        return T45.instance;
    }
}
