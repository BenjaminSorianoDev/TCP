package main.java;

/**
 * @author BSo
 **/
public class Event {

    private String name;

    public Event(){ this.setName(null);}

    public Event(String name){
        this.name = name;
    }

    public boolean is(Event e){
        if(this.name == e.name)
            return true;
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
