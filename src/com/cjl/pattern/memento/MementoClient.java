package com.cjl.pattern.memento;

public class MementoClient {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();
        originator.setState("状态1");
        System.out.println("MementoClient.main"+originator.getState());
        caretaker.saveMemento(originator.createMemento());
        originator.setState("状态2");
        originator.restoreMemento(caretaker.retieveMemento());
        System.out.println("MementoClient.main"+originator.getState());

        System.out.println("MementoClient.main"+originator.getState());

    }
}
