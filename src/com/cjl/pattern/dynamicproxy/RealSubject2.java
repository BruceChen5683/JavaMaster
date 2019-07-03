package com.cjl.pattern.dynamicproxy;

/**
 * Created by chenjianliang on 2017/5/10.
 */
public class RealSubject2 implements Subject2{
    @Override
    public int set(int a) {
        System.out.println("set");
        return a;
    }
}
