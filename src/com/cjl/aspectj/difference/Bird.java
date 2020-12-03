package com.cjl.aspectj.difference;

public class Bird implements Animal {
    @Override
    public void move() {
        System.out.println("Bird.move");
    }
}
