package main.java.performable.concrete;

import main.java.Context;
import main.java.performable.Performable;

/**
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

    }
}
