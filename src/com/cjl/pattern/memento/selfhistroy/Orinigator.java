package com.cjl.pattern.memento.selfhistroy;

import com.cjl.pattern.memento.Memento;

public class Orinigator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this);
    }

    public void restoreMemento(MementoIF memento){
        setState(((Memento)memento).getState());
    }

    private class Memento implements MementoIF{
        private String state;

        private Memento(Orinigator o){
            this.state = o.state;
        }
        private String getState() {
            return state;
        }
    }
}
