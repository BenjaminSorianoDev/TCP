package main.java.transition.concrete;

import main.java.Context;
import main.java.transition.AbstractTransition;

/**
 * @author BSo
 **/
public class T01 extends AbstractTransition {

    /**
     *
     */
    public static volatile T01 instance = null;

    private T01(Context aContext){
        this.setaContext(aContext);
        this.setaCondition(aContext.getaConcreteFactory().createOpenEvent());
        this.setAnAction(aContext.getaConcreteFactory().createA01());
        // TODO
        //this.setNextState();
    }

    public final static T01 getInstance(Context aContext){
        if (T01.instance == null) {
            synchronized(T01.class) {
                if (T01.instance == null) {
                    T01.instance = new T01(aContext);
                }
            }
        }
        return T01.instance;
    }
}
