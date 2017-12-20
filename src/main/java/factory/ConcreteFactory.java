package main.java.factory;

import main.java.Context;
import main.java.performable.concrete.*;
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

    /*
     * creation of Transition
     */
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

    /*
     * Creation of performable
     */
    public ActionForReset createActionForReset() {return ActionForReset.getInstance();}
    public ActionOnTimer createActionOnTimer() {return ActionOnTimer.getInstance();}
    public ActionOnAck createActionOnAck() {return ActionOnAck.getInstance();}
    public ActionResetAll createActionResetAll() {return ActionResetAll.getInstance();}
    public ActionToEnd createActionToEnd() {return ActionToEnd.getInstance();}
    public ActionWaitMessage createActionWaitMessage() {return ActionWaitMessage.getInstance();}
    public ActionWriteFinalMessage createActionWriteFinalMessage() {return ActionWriteFinalMessage.getInstance();}
    public ActionWriteMessage createActionWriteMessage() {return ActionWriteMessage.getInstance();}

}
