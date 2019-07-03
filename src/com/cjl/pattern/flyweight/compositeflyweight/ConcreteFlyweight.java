package com.cjl.pattern.flyweight.compositeflyweight;

public class ConcreteFlyweight implements Flyweight{
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void operation(String extrinsicState) {

    }
}
