package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
 * Actions performed when a Timeover is detected.
 * @author BSo
 **/
public final class ActionOnTimer implements Performable {

    public static volatile ActionOnTimer instance = null;

    private ActionOnTimer(){}

    public final static ActionOnTimer getInstance(){
        if (ActionOnTimer.instance == null) {
            synchronized(ActionOnTimer.class) {
                if (ActionOnTimer.instance == null) {
                    ActionOnTimer.instance = new ActionOnTimer();
                }
            }
        }
        return ActionOnTimer.instance;
    }

    @Override
    public void perform(Context aContext) {
    	aContext.getaTCPServer().timer();

    }
}
