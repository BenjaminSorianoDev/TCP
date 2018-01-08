package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T331 extends AbstractTransition {
    /**
     *
     */
    public static volatile T331 instance = null;

    private T331(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAckEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionWriteMessage());
        this.setNextState(State3.getInstance(aContext));
    }

    public final static T331 getInstance(Context aContext){
        if (T331.instance == null) {
            synchronized(T331.class) {
                if (T331.instance == null) {
                    T331.instance = new T331(aContext);
                }
            }
        }
        return T331.instance;
    }
}
