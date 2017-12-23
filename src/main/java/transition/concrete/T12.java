package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T12 extends AbstractTransition{
    /**
     *
     */
    public static volatile T12 instance = null;

    private T12(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createSynEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionWaitMessage());
        // TODO
        //this.setNextState();
    }

    public final static T12 getInstance(Context aContext){
        if (T12.instance == null) {
            synchronized(T12.class) {
                if (T12.instance == null) {
                    T12.instance = new T12(aContext);
                }
            }
        }
        return T12.instance;
    }
}
