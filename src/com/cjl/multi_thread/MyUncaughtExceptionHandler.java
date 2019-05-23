package com.cjl.multi_thread;

public class MyUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("MyUncaughtExceptionHandler "+ e);
    }
}
