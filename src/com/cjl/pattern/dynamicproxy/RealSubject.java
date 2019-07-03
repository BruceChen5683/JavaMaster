package com.cjl.pattern.dynamicproxy;

/**
 * Created by chenjianliang on 2017/5/10.
 */
public class RealSubject implements Subject{
    @Override
    public void request() {
        System.out.println("From real Subject!");
    }
}
