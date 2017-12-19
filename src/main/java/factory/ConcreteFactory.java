package main.java.factory;

import main.java.Context;
import main.java.performable.concrete.A01;
import main.java.satisfiable.concrete.C01;
import main.java.state.concrete.State0;
import main.java.transition.AbstractTransition;
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

    public C01 createC01() { return new C01();}

    public A01 createA01() {return new A01();}

}
