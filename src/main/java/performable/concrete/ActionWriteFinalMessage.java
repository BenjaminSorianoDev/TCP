package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
 * @author BSo
 **/
public final class ActionWriteFinalMessage implements Performable {

    public static volatile ActionWriteFinalMessage instance = null;

    private ActionWriteFinalMessage(){}

    public final static ActionWriteFinalMessage getInstance(){
        if (ActionWriteFinalMessage.instance == null) {
            synchronized(ActionWriteFinalMessage.class) {
                if (ActionWriteFinalMessage.instance == null) {
                    ActionWriteFinalMessage.instance = new ActionWriteFinalMessage();
                }
            }
        }
        return ActionWriteFinalMessage.instance;
    }

    @Override
    public void perform(Context aContext) {

    }
}
