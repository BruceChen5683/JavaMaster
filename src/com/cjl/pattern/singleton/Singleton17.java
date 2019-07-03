package com.cjl.pattern.singleton;

public class Singleton17 {
    private Singleton17(){}

    private static class SingletonInstance{
        private static final Singleton17 INSTANCE = new Singleton17();
    }

    public static Singleton17 getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
