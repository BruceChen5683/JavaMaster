package com.cjl.pattern.chainofresponsibility;


public class ConcreteHandlerC extends Handler{
    boolean someCondition = false;
    @Override
    public void handleRequest(int i) {
        if (i < 200){
            System.out.println("ConcreteHandlerC.handleRequest");
        }else {
            if(this.successor != null){
                this.successor.handleRequest(i);
            }
        }
    }
}
