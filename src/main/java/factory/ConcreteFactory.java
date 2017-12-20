package main.java.factory;

import main.java.Context;
import main.java.performable.concrete.ActionForReset;
import main.java.satisfiable.concrete.OpenEvent;
import main.java.state.concrete.State0;
import main.java.transition.concrete.T01;

/**
 * @author BSo
 **/
public class ConcreteFactory {

    private Context aContext;

    public ConcreteFactory(Context aContext){
        this.aContext = aContext;
    }

    /**
     * TODO
     * Create a main.java.state.concrete.State0 instance
     * @return a main.java.state.concrete.State0
     */
    public State0 createState0() {
        return State0.getInstance(this.aContext);
    }

    public T01 createT01() { return T01.getInstance(aContext); }

    public OpenEvent createC01() { return new OpenEvent();}

    public ActionForReset createA01() {return new ActionForReset();}

}
