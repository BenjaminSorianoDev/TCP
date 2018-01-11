package main.java.transition;

import main.java.Context;
import main.java.performable.Performable;
import main.java.satisfiable.Satisfiable;
import main.java.state.AbstractState;

/**
 * AbstractTransition as defined in the Transition pattern.
 * @author BSo
 **/
public abstract class AbstractTransition {
	
	/**
     * The condition to make the transition
     */

    private Satisfiable aCondition;
    /**
     * The action to perform
     */
    private Performable anAction;
    /**
     * The state where to go
     */
    private AbstractState nextState;

    private Context aContext;
	

    public Satisfiable getaCondition() {
        return aCondition;
    }

    public void setaCondition(Satisfiable aCondition) {
        this.aCondition = aCondition;
    }

    public Performable getAnAction() {
        return anAction;
    }

    public void setAnAction(Performable anAction) {
        this.anAction = anAction;
    }

    public AbstractState getNextState() {
        return nextState;
    }

    public void setNextState(AbstractState nextState) {
        this.nextState = nextState;
    }

    public Context getaContext() {
        return aContext;
    }

    public void setaContext(Context aContext) {
        this.aContext = aContext;
    }

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
