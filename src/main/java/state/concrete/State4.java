package main.java.state.concrete;

import main.java.Context;
import main.java.state.AbstractState;

public class State4 extends AbstractState{
	/**
	    * instance de State4
	    */
	   public static volatile State4 instance = null;

	   /**
	    * Contexte
	    */
	   private static Context aContext;

	   /**
	    * constructeur privé de la class State4
	    * @param aContext
	    */
	   private State4(Context aContext){
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT41());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT44());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT45());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT47());
	       State4.aContext = aContext;
	   }

	   /**
	    * MÃ©thode permettant de renvoyer une instance de la classe Singleton
	    * @return Retourne l'instance du singleton.
	    */
	   public final static State4 getInstance(Context aContext){
	       if (State4.instance == null) {
	           synchronized(State4.class) {
	               if (State4.instance == null) {
	                   State4.instance = new State4(aContext);
	               }
	           }
	       }
	       return State4.instance;
	   }
}
