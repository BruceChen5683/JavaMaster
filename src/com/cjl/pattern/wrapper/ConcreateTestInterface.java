package com.cjl.pattern.wrapper;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class ConcreateTestInterface implements TestInterface{
    @Override
    public void set() {
        System.out.println("ConcreateTestInterface.set");
    }
}
