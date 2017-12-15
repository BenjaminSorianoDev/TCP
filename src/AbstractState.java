import java.util.*;

/**
 * @author BSo
 **/
public class AbstractState {

    /**
     * si quelqu'un arrive a la parcourir sans iterator ?
     */
    private final LinkedHashSet<AbstractTransition> transitionSet= new LinkedHashSet<>();

    /**
     * 
     * @param aContext
     * @return
     */
    AbstractState fire(T aContext){
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
