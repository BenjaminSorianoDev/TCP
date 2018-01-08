package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T67 extends AbstractTransition {
    /**
     *
     */
    public static volatile T67 instance = null;

    private T67(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAbortEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        this.setNextState(State7.getInstance(aContext));
    }

    public final static T67 getInstance(Context aContext){
        if (T67.instance == null) {
            synchronized(T67.class) {
                if (T67.instance == null) {
                    T67.instance = new T67(aContext);
                }
            }
        }
        return T67.instance;
    }
}
