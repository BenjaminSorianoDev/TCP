package main.java.state;

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
    private static TCPServer aTCPServer;

    /**
     *
     * @param aTCPServer
     */
    private State0(TCPServer aTCPServer){
        super();
        State0.aTCPServer = aTCPServer;
    }

    /**
     * Méthode permettant de renvoyer une instance de la classe Singleton
     * @return Retourne l'instance du singleton.
     */
    public final static State0 getInstance(TCPServer aTCPServer){
        if (State0.instance == null) {
            synchronized(State0.class) {
                if (State0.instance == null) {
                    State0.instance = new State0(aTCPServer);
                }
            }
        }
        return State0.instance;
    }
}
