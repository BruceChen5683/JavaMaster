package com.cjl.pattern.visitor.actualcombat;

import java.util.ArrayList;
import java.util.List;

public class Home {
    private List<Animal> animals = new ArrayList<Animal>();

    public void action(Person person){
        for (Animal animal : animals) {
            animal.accept(person);
        }
    }
    public void add(Animal animal){
        animals.add(animal);
    }
}
