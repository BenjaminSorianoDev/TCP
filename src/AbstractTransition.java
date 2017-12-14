/**
 * @author BSo
 **/
public class AbstractTransition {

    /**
     * TODO
     * @return
     */
    public boolean isFirable(){
        return true;
    }

    /**
     * TODO
     * @param acontext
     * @return
     */
    public AbstractState fire(T acontext) {
        return null;
    }
}
