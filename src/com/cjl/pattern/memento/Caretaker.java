package com.cjl.pattern.memento;

public class Caretaker {
    private Memento memento;

    public Memento retieveMemento() {
        return this.memento;
    }

    public void saveMemento(Memento memento) {
        this.memento = memento;
    }
}
