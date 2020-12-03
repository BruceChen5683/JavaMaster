package com.cjl.aspectj.difference;

import java.util.ArrayList;
import java.util.List;

public class Move {
    public static void main(String[] args) {
        List<Animal> lists = new ArrayList<>();
        lists.add(new Bird());
        lists.add(new Snake());
        move(lists);
    }

    public static void move(List<Animal> lists) {
        for (Animal animal : lists) {
            animal.move();
        }
    }
}
