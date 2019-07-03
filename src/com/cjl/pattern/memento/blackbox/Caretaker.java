package com.cjl.pattern.memento.blackbox;

public class Caretaker {
    private MementoIF memento;
    public MementoIF retrieveMemento(){
        return memento;
    }
    public void saveMemento(MementoIF memento){
        this.memento = memento;
    }
}
