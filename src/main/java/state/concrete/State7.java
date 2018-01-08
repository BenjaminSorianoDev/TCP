package main.java.state.concrete;

import main.java.Context;
import main.java.state.AbstractState;

public class State7 extends AbstractState{
	/**
	    * instance de State7
	    */
	   public static volatile State7 instance = null;

	   /**
	    * Contexte
	    */
	   private static Context aContext;

	   /**
	    * constructeur privé de la class State7
	    * @param aContext
	    */
	   private State7(Context aContext){
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT70());
	       State7.aContext = aContext;
	   }

	   /**
	    * MÃ©thode permettant de renvoyer une instance de la classe Singleton
	    * @return Retourne l'instance du singleton.
	    */
	   public final static State7 getInstance(Context aContext){
	       if (State7.instance == null) {
	           synchronized(State7.class) {
	               if (State7.instance == null) {
	                   State7.instance = new State7(aContext);
	               }
	           }
	       }
	       return State7.instance;
	   }


}
