package com.cjl.pattern.singleton;

public class NotSingleton {
    //XXX wrong
    private static NotSingleton mNotSingleton = new NotSingleton();

    private NotSingleton(){
        System.out.println("NotSingleton.NotSingleton constructor");
    }
    public static NotSingleton getmNotSingleton() {
        return mNotSingleton;
    }

    public static NotSingleton getSmNotSingleton(){
        return new NotSingleton();
    }
}
