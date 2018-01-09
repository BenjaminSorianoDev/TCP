package main.java.performable;

import main.java.Context;

/**
 * Performable interface, used as seen in the transition pattern.
 * @author BSo
 **/
public interface Performable {

    /**
     * performs the actions implemented.
     * @param aContext
     */
    public void perform(Context aContext);
}
