package com.cjl.pattern.singleton;

public class Singleton15 {
    private static Singleton15 singleton;

    private Singleton15(){}

    public static Singleton15 getInstance(){
        if (null == singleton){
            synchronized (Singleton15.class){
                singleton = new Singleton15();
            }
        }
        return singleton;
    }
}
