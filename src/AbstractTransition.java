/**
 * @author BSo
 **/
public class AbstractTransition {

    /**
     *
     */
    Satisfiable<Context> aCondition;
    /**
     *
     */
    Performable<Context> anAction;
    /**
     *
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
