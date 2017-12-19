package main.java.factory;

import main.java.Context;
import main.java.state.State0;

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
     * Create a main.java.state.State0 instance
     * @return a main.java.state.State0
     */
    public State0 createState0() {
        return State0.getInstance(this.aContext);
    }
}
