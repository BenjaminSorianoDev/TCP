package main.java.factory;

import main.java.Context;
import main.java.performable.concrete.*;
import main.java.satisfiable.concrete.*;
import main.java.state.concrete.*;
import main.java.transition.concrete.*;

/**
 * @author BSo & MMo
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
    public State1 createState1() {
        return State1.getInstance(this.aContext);
    }
    public State2 createState2() {
        return State2.getInstance(this.aContext);
    }
    public State3 createState3() {
        return State3.getInstance(this.aContext);
    }
    public State4 createState4() {
        return State4.getInstance(this.aContext);
    }
    public State5 createState5() {
        return State5.getInstance(this.aContext);
    }
    public State6 createState6() {
        return State6.getInstance(this.aContext);
    }
    public State7 createState7() {
        return State7.getInstance(this.aContext);
    }

    /*
     * creation of Transition
     */
    public T01 createT01() { return T01.getInstance(aContext); }
    public T10 createT10() { return T10.getInstance(aContext); }
    public T12 createT12() { return T12.getInstance(aContext); }
    public T210 createT210() { return T210.getInstance(aContext); }
    public T211 createT211() { return T211.getInstance(aContext); }
    public T23 createT23() { return T23.getInstance(aContext); }
    public T27 createT27() { return T27.getInstance(aContext); }
    public T31 createT31() { return T31.getInstance(aContext); }
    public T330 createT330() { return T330.getInstance(aContext); }
    public T331 createT331() { return T331.getInstance(aContext); }
    public T34 createT34() { return T34.getInstance(aContext); }
    public T37 createT37() { return T37.getInstance(aContext); }
    public T41 createT41() { return T41.getInstance(aContext); }
    public T44 createT44() { return T44.getInstance(aContext); }
    public T45 createT45() { return T45.getInstance(aContext); }
    public T47 createT47() { return T47.getInstance(aContext); }
    public T51 createT51() { return T51.getInstance(aContext); }
    public T56 createT56() { return T56.getInstance(aContext); }
    public T57 createT57() { return T57.getInstance(aContext); }
    public T610 createT610() { return T610.getInstance(aContext); }
    public T611 createT611() { return T611.getInstance(aContext); }
    public T67 createT67() { return T67.getInstance(aContext); }
    public T70 createT70() { return T70.getInstance(aContext); }

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
