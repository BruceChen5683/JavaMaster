package com.cjl.pattern.chainofresponsibility;


public class ConcreteHandlerB extends Handler{
    boolean someCondition = false;
    @Override
    public void handleRequest(int i) {
        if (i < 100){
            System.out.println("ConcreteHandlerB.handleRequest");
        }else {
            if(this.successor != null){
                this.successor.handleRequest(i);
            }
        }
    }
}
