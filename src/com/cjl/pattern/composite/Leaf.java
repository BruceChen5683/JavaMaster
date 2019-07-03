package com.cjl.pattern.composite;

public class Leaf implements Compoent{
    @Override
    public void doSth() {
        System.out.println("Leaf.doSth");
    }
}
