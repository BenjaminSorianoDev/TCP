package main.java.state;

import main.java.Context;
import main.java.TCPServer;

/**
 * @author BSo
 **/
public final class State0 extends AbstractState {

    /**
     *
     */
    public static volatile State0 instance = null;

    /**
     *
     */
    private static Context aContext;

    /**
     *
     * @param aContext
     */
    private State0(Context aContext){
        // make the transitionSet
        State0.aContext = aContext;
    }

    /**
     * Méthode permettant de renvoyer une instance de la classe Singleton
     * @return Retourne l'instance du singleton.
     */
    public final static State0 getInstance(Context aContext){
        if (State0.instance == null) {
            synchronized(State0.class) {
                if (State0.instance == null) {
                    State0.instance = new State0(aContext);
                }
            }
        }
        return State0.instance;
    }
}
