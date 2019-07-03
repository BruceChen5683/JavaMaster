package com.cjl.pattern.state;

public class ConcreteStateB implements State {
    @Override
    public void handle(String parm) {
        System.out.println("ConcreteStateB.handle");
    }
}
