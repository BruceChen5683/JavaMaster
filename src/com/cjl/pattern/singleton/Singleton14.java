package com.cjl.pattern.singleton;

public class Singleton14 {

    private static Singleton14 singleton;

    private Singleton14() {}

    public static synchronized Singleton14 getInstance() {
        if (singleton == null) {
            singleton = new Singleton14();
        }
        return singleton;
    }
}
