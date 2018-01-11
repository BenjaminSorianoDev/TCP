package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
 * Actions performed when the applicative is returned to a waiting state.
 * @author BSo
 **/
public final class ActionResetAll implements Performable {

    public static volatile ActionResetAll instance = null;

    private ActionResetAll(){}

    public final static ActionResetAll getInstance(){
        if (ActionResetAll.instance == null) {
            synchronized(ActionResetAll.class) {
                if (ActionResetAll.instance == null) {
                    ActionResetAll.instance = new ActionResetAll();
                }
            }
        }
        return ActionResetAll.instance;
    }

    @Override
    public void perform(Context aContext) {
    	aContext.getaTCPServer().resetAll();

    }
}
