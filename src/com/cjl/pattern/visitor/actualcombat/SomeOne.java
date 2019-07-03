package com.cjl.pattern.visitor.actualcombat;

public class SomeOne extends Person{
    @Override
    public void feed(Cat cat) {
        System.out.println("SomeOne.feed cat");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("SomeOne.feed dog");
    }
}
