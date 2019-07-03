package com.cjl.pattern.composite2;


public class Client {
    public static void main(String[] args) {
        Compoent compoent = new Composite();
        Leaf leaf1 = new Leaf();
        Leaf leaf2 = new Leaf();
        Leaf leaf3 = new Leaf();
        Composite compoent2 = new Composite();
        compoent2.add(leaf1);
        compoent2.add(leaf2);
        compoent.add(leaf3);
        compoent.add(compoent2);

        compoent.doSth();
    }
}
