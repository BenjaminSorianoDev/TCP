package main.java;

import main.java.factory.ConcreteFactory;
import main.java.state.AbstractState;

/**
 * TODO
 * @author BSo
 **/
public class Context {

    /**
     * Current State
     */
    private AbstractState aState;

    /**
     * The main.java.TCPServer
     */
    private final TCPServer aTCPServer;

    /**
     * A factory to create Object ( States )
     */
    private ConcreteFactory aConcreteFactory;

    /**
     * @param aTCPServer
     */
    public Context(TCPServer aTCPServer){
        this.aConcreteFactory = new ConcreteFactory(this);
        this.aTCPServer = aTCPServer;
        aState = aConcreteFactory.createState0();
    }

    /**
     * Start the main.java.TCPServer
     */
    public void contextTry(){
        this.aState = aState.fire(this);
        // Ajouter le timer envoyer par mail par Marie pour la ligne suivante
        //this.aTCPServer.aBasicTimer.stop();
    }
}
