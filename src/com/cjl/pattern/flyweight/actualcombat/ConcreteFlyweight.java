package com.cjl.pattern.flyweight.actualcombat;

public class ConcreteFlyweight implements Flyweight{
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    @Override
    public void order(String user) {
        System.out.println("ConcreteFlyweight.order 内蕴状态："+intrinsicState + "   外蕴状态:"+user);
    }
}
