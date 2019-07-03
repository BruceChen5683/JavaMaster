package com.cjl.pattern.singleton;

public class Singleton13 {

    private static Singleton13 Singleton;

    private Singleton13() {}

    public static Singleton13 getInstance() {
        if (Singleton == null) {
            Singleton = new Singleton13();
        }
        return Singleton;
    }
}
