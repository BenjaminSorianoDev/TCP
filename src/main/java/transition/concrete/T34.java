package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T34 extends AbstractTransition {
    /**
     *
     */
    public static volatile T34 instance = null;

    private T34(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createAckEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionWriteFinalMessage());
        // TODO
        //this.setNextState();
    }

    public final static T34 getInstance(Context aContext){
        if (T34.instance == null) {
            synchronized(T34.class) {
                if (T34.instance == null) {
                    T34.instance = new T34(aContext);
                }
            }
        }
        return T34.instance;
    }
}
