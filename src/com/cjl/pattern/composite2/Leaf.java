package com.cjl.pattern.composite2;

import java.util.List;

public class Leaf implements Compoent{
    @Override
    public void doSth() {
        System.out.println("Leaf.doSth");
    }

    @Override
    public void add(Compoent compoent) {
        //空实现
    }

    @Override
    public void remove(Compoent compoent) {

    }

    @Override
    public List<Compoent> getAll() {
        return null;
    }
}
