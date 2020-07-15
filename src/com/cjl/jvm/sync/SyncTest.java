package com.cjl.jvm.sync;

import com.sun.org.apache.regexp.internal.RE;

public class SyncTest {

    public void method(){
        synchronized (this){
            System.out.println("123");
        }
        System.out.println("456");
    }

    public synchronized String method1(){
        return null;
    }

    public static synchronized int method2(){
        return 0;
    }
}
