package main.java;

import main.java.factory.ConcreteFactory;
import main.java.satisfiable.Satisfiable;
import main.java.state.AbstractState;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Contains everything that's needed to run the Finite state machine.
 * @author BSo
 **/
public class Context {

    public Set<Event> getCmdA() {
        return cmdA;
    }

    /**
     * Control for avaiability of the applicative
     */
    private final Set<Event> cmdA = new LinkedHashSet<Event>();

    public Set<Event> getTpcMsgC() {
        return tpcMsgC;
    }

    public boolean isEoF() {
        return EoF;
    }

    public boolean isTimeOver() {
        return TimeOver;
    }

    /**
     * Control for the received message type
     */
    private final Set<Event> tpcMsgC = new LinkedHashSet<Event>();

    /**
     * Control for when the response is fully sent
     */
    private final boolean EoF = false;

    /**
     * Control for when there is a timeover while waiting for an answer from the IP Layer.
     */
    private final boolean TimeOver = false;

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
    
    public AbstractState getaState() {
        return aState;
    }

    public void setaState(AbstractState aState) {
        this.aState = aState;
    }

    public TCPServer getaTCPServer() {
        return aTCPServer;
    }

    public ConcreteFactory getaConcreteFactory() {
        return aConcreteFactory;
    }

    public void setaConcreteFactory(ConcreteFactory aConcreteFactory) {
        this.aConcreteFactory = aConcreteFactory;
    }

    

    /**
     * Start the main.java.TCPServer
     */
    public void contextTry(){
        this.aState = aState.fire(this);
        // Ajouter le timer envoyer par mail par Marie pour la ligne suivante
        // this.aTCPServer.aBasicTimer.stop();
    }
}
