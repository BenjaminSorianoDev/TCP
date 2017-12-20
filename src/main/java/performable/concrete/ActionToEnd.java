package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
 * @author BSo
 **/
public final class ActionToEnd implements Performable {

    public static volatile ActionToEnd instance = null;

    private ActionToEnd(){}

    public final static ActionToEnd getInstance(){
        if (ActionToEnd.instance == null) {
            synchronized(ActionToEnd.class) {
                if (ActionToEnd.instance == null) {
                    ActionToEnd.instance = new ActionToEnd();
                }
            }
        }
        return ActionToEnd.instance;
    }

    @Override
    public void perform(Context aContext) {

    }
}
