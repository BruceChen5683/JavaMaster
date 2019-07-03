package com.cjl.pattern.dynamicproxy;

/**
 * Created by chenjianliang on 2017/5/11.
 */
public class RealSubject3 implements Subject{
    @Override
    public void request() {
        System.out.println("3333333");
    }
}
