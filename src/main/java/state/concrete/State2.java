package main.java.state.concrete;

import main.java.Context;
import main.java.state.AbstractState;

public class State2 extends AbstractState{
	/**
	    * instance de State2
	    */
	   public static volatile State2 instance = null;

	   /**
	    * Contexte
	    */
	   private static Context aContext;

	   /**
	    * constructeur privé de la class State2
	    * @param aContext
	    */
	   private State2(Context aContext){
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT210());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT211());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT23());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT27());
	       State2.aContext = aContext;
	   }

	   /**
	    * MÃ©thode permettant de renvoyer une instance de la classe Singleton
	    * @return Retourne l'instance du singleton.
	    */
	   public final static State2 getInstance(Context aContext){
	       if (State2.instance == null) {
	           synchronized(State2.class) {
	               if (State2.instance == null) {
	                   State2.instance = new State2(aContext);
	               }
	           }
	       }
	       return State2.instance;
	   }


}
