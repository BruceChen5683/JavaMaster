package com.cjl.pattern.strategy;

public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void execute(){
        strategy.doSth();
    }
}
