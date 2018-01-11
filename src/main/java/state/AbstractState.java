package main.java.state;

import main.java.transition.AbstractTransition;
import main.java.Context;

import java.util.*;

/**
 * AbstractState as defined in the Transition pattern.
 * @author BSo
 **/
public abstract class AbstractState {

    /**
     * Transitions List
     */
    private LinkedHashSet<AbstractTransition> transitionSet= new LinkedHashSet<>();

    /**
     *
     * @param transitionSet
     */
    public void setTransitionSet(LinkedHashSet<AbstractTransition> transitionSet) {
        this.transitionSet = transitionSet;
    }

    /**
     *
     * @return
     */
    public LinkedHashSet<AbstractTransition> getTransitionSet() {
        return transitionSet;
    }

    /**
     * Start the state, path transitions and try to go to another state if it's not possible stay in the current state
     * @param aContext
     * @return the new state to fire or the current state
     */
    public AbstractState fire(Context aContext){
        Iterator<AbstractTransition> it = transitionSet.iterator();
        while(it.hasNext())
        {
            AbstractTransition aTransition = (AbstractTransition) it.next();
            if(aTransition.isFirable(aContext)){
                return aTransition.fire(aContext);
            }
        }
        return this;
    }
}
