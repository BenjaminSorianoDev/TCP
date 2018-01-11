package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T70 extends AbstractTransition {
    /**
     *
     */
    public static volatile T70 instance = null;

    private T70(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(null);
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        this.setNextState(aContext.getaConcreteFactory().createState0());
    }

    public final static T70 getInstance(Context aContext){
        if (T70.instance == null) {
            synchronized(T70.class) {
                if (T70.instance == null) {
                    T70.instance = new T70(aContext);
                }
            }
        }
        return T70.instance;
    }
}
