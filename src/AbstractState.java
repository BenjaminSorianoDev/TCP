import java.util.*;

/**
 * @author BSo
 **/
public class AbstractState {

    /**
     * si quelqu'un arrive a la parcourir sans iterator ?
     */
    private final LinkedHashSet<AbstractTransition> transitionSet= new LinkedHashSet<>();

    AbstractState fire(T acontext){
        Iterator it = transitionSet.iterator();
        while(it.hasNext())
        {
            AbstractTransition aTransition = (AbstractTransition) it.next();
            if(aTransition.isFirable()){
                return aTransition.fire(acontext);
            }
        }
        return this;
    }
}
