package com.cjl.pattern.strategy;

public class ConcreteStrategy1 implements Strategy{
    @Override
    public void doSth() {
        System.out.println("具体策略1");
    }
}
