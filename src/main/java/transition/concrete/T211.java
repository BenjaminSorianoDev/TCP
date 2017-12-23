package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T211 extends AbstractTransition {
    /**
     *
     */
    public static volatile T211 instance = null;

    private T211(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createResetEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionOnAck());
        // TODO
        //this.setNextState();
    }

    public final static T211 getInstance(Context aContext){
        if (T211.instance == null) {
            synchronized(T211.class) {
                if (T211.instance == null) {
                    T211.instance = new T211(aContext);
                }
            }
        }
        return T211.instance;
    }
}
