/**
 * TODO
 * @author BSo
 **/
public class Context {
    /**
     *
     */
    private AbstractState aState;
    /**
     *
     */
    private final TCPServer aTCPServer;

    /**
     *
     * @param aTCPServer
     */
    public Context(TCPServer aTCPServer){
        this.aTCPServer = aTCPServer;
        aState = new State0();
    }

    public void contextTry(){
        this.aState = aState.fire(this);
        // Ajouter le timer envoyer par mail par Marie pour la ligne suivante
        //this.aTCPServer.aBasicTimer.stop();
    }
}
