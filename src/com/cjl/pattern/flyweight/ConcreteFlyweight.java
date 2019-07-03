package com.cjl.pattern.flyweight;

public class ConcreteFlyweight implements Flyweight{

    /**
     * 描述内蕴状态
     */
    private String intrinsicState;

    public ConcreteFlyweight(String intrinsicState){
        this.intrinsicState = intrinsicState;
    }

    /**
     * 外蕴状态作为参数传入，改变方法的行为
     * 但是并不改变对象的内蕴状态
     * @param extrinsicState
     */
    @Override
    public void operation(String extrinsicState) {

    }
}
