package main.java.state.concrete;

import main.java.Context;
import main.java.state.AbstractState;

public class State5 extends AbstractState{
	/**
	    * instance de State5
	    */
	   public static volatile State5 instance = null;

	   /**
	    * Contexte
	    */
	   private static Context aContext;

	   /**
	    * constructeur privé de la class State5
	    * @param aContext
	    */
	   private State5(Context aContext){
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT51());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT56());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT57());
	       State5.aContext = aContext;
	   }

	   /**
	    * MÃ©thode permettant de renvoyer une instance de la classe Singleton
	    * @return Retourne l'instance du singleton.
	    */
	   public final static State5 getInstance(Context aContext){
	       if (State5.instance == null) {
	           synchronized(State5.class) {
	               if (State5.instance == null) {
	                   State5.instance = new State5(aContext);
	               }
	           }
	       }
	       return State5.instance;
	   }

}
