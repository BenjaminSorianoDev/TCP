package main.java;

import main.java.factory.AbstractFactory;
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
    private AbstractFactory anAbstractFactory;

    /**
     * Class constructor
     * @param aTCPServer
     */
    public Context(TCPServer aTCPServer){
        this.anAbstractFactory = new ConcreteFactory();
        this.aTCPServer = aTCPServer;
        aState = anAbstractFactory.createState0();
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
