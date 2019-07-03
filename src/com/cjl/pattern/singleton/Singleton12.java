package com.cjl.pattern.singleton;

public class Singleton12 {

    private static Singleton12 instance;

    static {
        instance = new Singleton12();
    }

    private Singleton12() {}

    public static Singleton12 getInstance() {
        return instance;
    }
}
