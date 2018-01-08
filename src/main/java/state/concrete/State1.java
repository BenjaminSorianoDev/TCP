package main.java.state.concrete;

import main.java.Context;
import main.java.state.AbstractState;

public class State1 extends AbstractState{
	/**
    * instance de State 1
    */
   public static volatile State1 instance = null;

   /**
    * Contexte
    */
   private static Context aContext;

   /**
    * constructeur privé de la class State1
    * @param aContext
    */
   private State1(Context aContext){
       // do the same thing with other transitions
       this.getTransitionSet().add(aContext.getaConcreteFactory().createT10());
       this.getTransitionSet().add(aContext.getaConcreteFactory().createT12());
       State1.aContext = aContext;
   }

   /**
    * MÃ©thode permettant de renvoyer une instance de la classe Singleton
    * @return Retourne l'instance du singleton.
    */
   public final static State1 getInstance(Context aContext){
       if (State1.instance == null) {
           synchronized(State1.class) {
               if (State1.instance == null) {
                   State1.instance = new State1(aContext);
               }
           }
       }
       return State1.instance;
   }

}
