package com.cjl.pattern.memento.selfhistroy;

public class Client {
    public static void main(String[] args) {
        Orinigator o = new Orinigator();
        o.setState("state1");

        MementoIF memento = o.createMemento();
        o.setState("state2");
        o.restoreMemento(memento);

        System.out.println("Client.main"+o.getState());
    }
}
