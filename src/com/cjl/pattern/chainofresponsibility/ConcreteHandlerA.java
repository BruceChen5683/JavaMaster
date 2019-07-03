package com.cjl.pattern.chainofresponsibility;


public class ConcreteHandlerA extends Handler{
    boolean someCondition = false;
    @Override
    public void handleRequest(int i) {
        if (i < 10){
            System.out.println("ConcreteHandlerA.handleRequest");
        }else {
            if(this.successor != null){
                this.successor.handleRequest(i);
            }
        }
    }
}
