package main.java.state.concrete;

import main.java.Context;
import main.java.state.AbstractState;

public class State3 extends AbstractState{
	
	/**
	    * instance de State3
	    */
	   public static volatile State3 instance = null;

	   /**
	    * Contexte
	    */
	   private static Context aContext;

	   /**
	    * constructeur privé de la class State3
	    * @param aContext
	    */
	   private State3(Context aContext){
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT31());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT330());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT331());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT34());
	       this.getTransitionSet().add(aContext.getaConcreteFactory().createT37());
	       State3.aContext = aContext;
	   }

	   /**
	    * MÃ©thode permettant de renvoyer une instance de la classe Singleton
	    * @return Retourne l'instance du singleton.
	    */
	   public final static State3 getInstance(Context aContext){
	       if (State3.instance == null) {
	           synchronized(State3.class) {
	               if (State3.instance == null) {
	                   State3.instance = new State3(aContext);
	               }
	           }
	       }
	       return State3.instance;
	   }
}
