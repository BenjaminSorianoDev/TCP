package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T330 extends AbstractTransition {
    /**
     *
     */
    public static volatile T330 instance = null;

    private T330(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createTimeOverEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionWriteFinalMessage());
        // TODO
        //this.setNextState();
    }

    public final static T330 getInstance(Context aContext){
        if (T330.instance == null) {
            synchronized(T330.class) {
                if (T330.instance == null) {
                    T330.instance = new T330(aContext);
                }
            }
        }
        return T330.instance;
    }
}
