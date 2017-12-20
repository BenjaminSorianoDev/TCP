package main.java.satisfiable.concrete;

import main.java.Context;
import main.java.satisfiable.Satisfiable;

/**
 * @author BSo
 **/
public class EndEvent implements Satisfiable {
    @Override
    public boolean isSatisfied(Context aContexte) {
        return false;
    }
}
