package com.cjl.pattern.visitor.actualcombat;

public class Owner extends Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("Owner.feed cat");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("Owner.feed dog");
    }
}
