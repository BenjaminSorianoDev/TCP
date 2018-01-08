package main.java.state.concrete;

import main.java.Context;
import main.java.state.AbstractState;

public class State6 extends AbstractState{
	/**
	    * instance de State6
	    */
	   public static volatile State6 instance = null;

	   /**
	    * Contexte
	    */
	   private static Context aContext;

	   /**
	    * constructeur privé de la class State6
	    * @param aContext
	    */
	   private State6(Context aContext){
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT610());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT611());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT67());
	       State6.aContext = aContext;
	   }

	   /**
	    * MÃ©thode permettant de renvoyer une instance de la classe Singleton
	    * @return Retourne l'instance du singleton.
	    */
	   public final static State6 getInstance(Context aContext){
	       if (State6.instance == null) {
	           synchronized(State6.class) {
	               if (State6.instance == null) {
	                   State6.instance = new State6(aContext);
	               }
	           }
	       }
	       return State6.instance;
	   }


}
