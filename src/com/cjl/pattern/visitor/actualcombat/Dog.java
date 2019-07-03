package com.cjl.pattern.visitor.actualcombat;

public class Dog extends Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("Dog.accept");
    }
}
