package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T611 extends AbstractTransition {
    /**
     *
     */
    public static volatile T611 instance = null;

    private T611(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createTimeOverEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionForReset());
        this.setNextState(aContext.getaConcreteFactory().createState1());
    }

    public final static T611 getInstance(Context aContext){
        if (T611.instance == null) {
            synchronized(T611.class) {
                if (T611.instance == null) {
                    T611.instance = new T611(aContext);
                }
            }
        }
        return T611.instance;
    }
}
