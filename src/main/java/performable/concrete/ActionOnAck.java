package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
 * Actions performed when an ACK signal is received.
 * @author BSo
 **/
public final class ActionOnAck implements Performable {

    public static volatile ActionOnAck instance = null;

    private ActionOnAck(){}

    public final static ActionOnAck getInstance(){
        if (ActionOnAck.instance == null) {
            synchronized(ActionOnAck.class) {
                if (ActionOnAck.instance == null) {
                    ActionOnAck.instance = new ActionOnAck();
                }
            }
        }
        return ActionOnAck.instance;
    }

    @Override
    public void perform(Context aContext) {
    	aContext.getaTCPServer().writeACK();
    	aContext.getaTCPServer().resetAll();

    }
}
