package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T51 extends AbstractTransition {
    /**
     *
     */
    public static volatile T51 instance = null;

    private T51(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createEndEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionOnAck());
        // TODO
        //this.setNextState();
    }

    public final static T51 getInstance(Context aContext){
        if (T51.instance == null) {
            synchronized(T51.class) {
                if (T51.instance == null) {
                    T51.instance = new T51(aContext);
                }
            }
        }
        return T51.instance;
    }
}
