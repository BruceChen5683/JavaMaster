package com.cjl.pattern.composite;

public class Client {
    public static void main(String[] args) {
        Composite composite = new Composite();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Composite composite2 = new Composite();
        composite2.add(leaf1);
        composite2.add(leaf2);
        composite.add(leaf3);
        composite.add(composite2);

        composite.doSth();
    }
}
