package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
 * @author BSo
 **/
public final class ActionWaitMessage implements Performable {

    public static volatile ActionWaitMessage instance = null;

    private ActionWaitMessage(){}

    public final static ActionWaitMessage getInstance(){
        if (ActionWaitMessage.instance == null) {
            synchronized(ActionWaitMessage.class) {
                if (ActionWaitMessage.instance == null) {
                    ActionWaitMessage.instance = new ActionWaitMessage();
                }
            }
        }
        return ActionWaitMessage.instance;
    }

    @Override
    public void perform(Context aContext) {
    	aContext.getaTCPServer().writeSYN();
    	aContext.getaTCPServer().writeACK();
    	aContext.getaTCPServer().timer();
    }
}
