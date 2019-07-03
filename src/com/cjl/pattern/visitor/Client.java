package com.cjl.pattern.visitor;

public class Client {
    public static void main(String[] args) {
        ObjectStructure objectStructure = new ObjectStructure();
        Node nodeA = new NodeA();
        Node nodeB = new NodeB();
        objectStructure.add(nodeA);
        objectStructure.add(nodeB);

        Visitor visitorA = new VisitorA();
        objectStructure.action(visitorA);

    }
}
