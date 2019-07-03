package com.cjl.pattern.state;

public class ConcreteStateA implements State{
    @Override
    public void handle(String parm) {
        System.out.println("ConcreteStateA.handle");
    }
}
