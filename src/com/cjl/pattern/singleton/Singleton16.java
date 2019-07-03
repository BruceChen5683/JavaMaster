package com.cjl.pattern.singleton;

public class Singleton16 {
    private static volatile Singleton16 singleton;

    private Singleton16(){}

    public static Singleton16 getInstance(){
        if (null ==  singleton){
            synchronized (Singleton16.class){
                if (null == singleton){
                    singleton = new Singleton16();
                }
            }
        }

        return singleton;
    }
}
