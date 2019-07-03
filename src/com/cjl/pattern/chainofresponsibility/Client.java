package com.cjl.pattern.chainofresponsibility;

public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandlerA();
        Handler handler2 = new ConcreteHandlerB();
        Handler handler3 = new ConcreteHandlerC();

        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        handler1.handleRequest(125);
    }
}
