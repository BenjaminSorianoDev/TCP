package main.java.transition.concrete;

import main.java.Context;
import main.java.state.concrete.*;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T41 extends AbstractTransition {
    /**
     *
     */
    public static volatile T41 instance = null;

    private T41(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createResetEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionOnAck());
        this.setNextState(aContext.getaConcreteFactory().createState1());
    }

    public final static T41 getInstance(Context aContext){
        if (T41.instance == null) {
            synchronized(T41.class) {
                if (T41.instance == null) {
                    T41.instance = new T41(aContext);
                }
            }
        }
        return T41.instance;
    }
}
