package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public final class T44 extends AbstractTransition {
    /**
     *
     */
    public static volatile T44 instance = null;

    private T44(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createTimeOverEvent());
        this.setAnAction(aContext.getaConcreteFactory().createActionToEnd());
        this.setNextState(aContext.getaConcreteFactory().createState4());
    }

    public final static T44 getInstance(Context aContext){
        if (T44.instance == null) {
            synchronized(T44.class) {
                if (T44.instance == null) {
                    T44.instance = new T44(aContext);
                }
            }
        }
        return T44.instance;
    }
}
