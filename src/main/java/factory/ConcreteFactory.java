package main.java.factory;

import main.java.Context;
import main.java.performable.concrete.ActionForReset;
import main.java.satisfiable.concrete.*;
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

    /*
     * Creation of satisfiable
     */
    public OpenEvent createOpenEvent() { return OpenEvent.getInstance();}
    public CloseEvent createCloseEvent() { return CloseEvent.getInstance();}
    public AbortEvent createAbortEvent() { return AbortEvent.getInstance();}
    public AckEvent createAckEvent() { return AckEvent.getInstance();}
    public ResetEvent createResetEvent() { return ResetEvent.getInstance();}
    public SynEvent createSynEvent() { return SynEvent.getInstance();}
    public TimeOverEvent createTimeOverEvent() { return TimeOverEvent.getInstance();}
    public EndEvent createEndEvent() { return EndEvent.getInstance();}

    public ActionForReset createA01() {return new ActionForReset();}

}
