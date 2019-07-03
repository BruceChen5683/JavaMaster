package com.cjl.pattern.wrapper;

import com.cjl.junitTest.Test;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class DecoratorTestInterface implements TestInterface{
    public  TestInterface testInterface;
    public DecoratorTestInterface(TestInterface testInterface){
        this.testInterface = testInterface;
    }
    @Override
    public void set() {
        testInterface.set();
    }
}
