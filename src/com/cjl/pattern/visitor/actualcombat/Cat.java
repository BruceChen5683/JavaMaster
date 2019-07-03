package com.cjl.pattern.visitor.actualcombat;

public class Cat extends Animal {
    @Override
    public void accept(Person person) {
        person.feed(this);
        System.out.println("Cat.accept");
    }
}
