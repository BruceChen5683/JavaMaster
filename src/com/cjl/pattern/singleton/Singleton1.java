package com.cjl.pattern.singleton;

public class Singleton1 {
    //饿汉
    private static final Singleton1 mSingleton = new Singleton1();

    private Singleton1(){
        System.out.println("Singleton1.Singleton1 constructor");
    }

    public static synchronized Singleton1 getInstance(){
        return mSingleton;
    }
}
