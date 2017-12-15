/**
 * @author BSo
 **/
public class AbstractTransition {

    /**
     *
     */
    Satisfiable<T> aCondition;
    /**
     *
     */
    Performable<T> anAction;
    /**
     *
     */
    private AbstractState nextState;

    /**
     *
     * @return
     */
    public boolean isFirable(T aContext){
        return this.aCondition.isSatisfied(aContext);
    }

    /**
     *
     * @param aContext
     * @return
     */
    public AbstractState fire(T aContext) {
        anAction.perform(aContext);
        return this.nextState;
    }
}
