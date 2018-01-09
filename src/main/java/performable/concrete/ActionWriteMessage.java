package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
 * Actions performed when we're writing a message.
 * @author BSo
 **/
public final class ActionWriteMessage implements Performable {

    public static volatile ActionWriteMessage instance = null;

    private ActionWriteMessage(){}

    public final static ActionWriteMessage getInstance(){
        if (ActionWriteMessage.instance == null) {
            synchronized(ActionWriteMessage.class) {
                if (ActionWriteMessage.instance == null) {
                    ActionWriteMessage.instance = new ActionWriteMessage();
                }
            }
        }
        return ActionWriteMessage.instance;
    }

    @Override
    public void perform(Context aContext) {
    	aContext.getaTCPServer().inc_I();
    	aContext.getaTCPServer().writeMsg();
    	aContext.getaTCPServer().timer();
    }
}
