package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
 * Actions performed when a RST signal is received.
 * @author BSo
 **/
public final class ActionForReset implements Performable{

    public static volatile ActionForReset instance = null;

    private ActionForReset(){}

    public final static ActionForReset getInstance(){
        if (ActionForReset.instance == null) {
            synchronized(ActionForReset.class) {
                if (ActionForReset.instance == null) {
                    ActionForReset.instance = new ActionForReset();
                }
            }
        }
        return ActionForReset.instance;
    }

    @Override
    public void perform(Context aContext) {
    	aContext.getaTCPServer().writeRST();
    }
}
