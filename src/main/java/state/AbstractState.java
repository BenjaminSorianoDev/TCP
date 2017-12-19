package main.java.state;

import main.java.transition.AbstractTransition;
import main.java.Context;

import java.util.*;

/**
 * @author BSo
 **/
public abstract class AbstractState {

    /**
     * si quelqu'un arrive a la parcourir sans iterator ?
     * Transitions List
     */
    private final LinkedHashSet<AbstractTransition> transitionSet= new LinkedHashSet<>();

    /**
     * Start the state, path transitions and try to go to another state if it's not possible stay in the current state
     * @param aContext
     * @return the new state to fire or the current state
     */
    public AbstractState fire(Context aContext){
        Iterator it = transitionSet.iterator();
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
