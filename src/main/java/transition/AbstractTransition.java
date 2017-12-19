package main.java.transition;

import main.java.Context;
import main.java.performable.Performable;
import main.java.satisfiable.Satisfiable;
import main.java.state.AbstractState;

/**
 * @author BSo
 **/
public abstract class AbstractTransition {

    /**
     * The condition to make the transition
     */
    private Satisfiable<Context> aCondition;
    /**
     * The action to perform
     */
    private Performable<Context> anAction;
    /**
     * The state where to go
     */
    private AbstractState nextState;

    /**
     *
     * @return
     */
    public boolean isFirable(Context aContext){
        return this.aCondition.isSatisfied(aContext);
    }

    /**
     *
     * @param aContext
     * @return
     */
    public AbstractState fire(Context aContext) {
        anAction.perform(aContext);
        return this.nextState;
    }
}
