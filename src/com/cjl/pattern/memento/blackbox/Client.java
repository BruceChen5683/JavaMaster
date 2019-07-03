package com.cjl.pattern.memento.blackbox;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("state1");
        caretaker.saveMemento(originator.createMemento());

        originator.setState("state2");
        System.out.println("Client.main"+originator.getState());

        originator.restoreMemento(caretaker.retrieveMemento());
        System.out.println("Client.main"+ originator.getState());
    }
}
