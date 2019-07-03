package com.cjl.pattern.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class Singleton11 implements Serializable{

    static {
        System.out.println("Singleton11.static initializer");
    }

    private final static Singleton11 INSTANCE = new Singleton11();

    private Singleton11(){
        if (INSTANCE != null){
            throw new RuntimeException();
        }
    }

    public static Singleton11 getInstance(){
        return INSTANCE;
    }

    private Object readResolve() throws ObjectStreamException{
        return INSTANCE;
    }


}
