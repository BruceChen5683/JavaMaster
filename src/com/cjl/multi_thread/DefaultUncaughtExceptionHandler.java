package com.cjl.multi_thread;

public class DefaultUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("DefaultUncaughtExceptionHandler "+ e);
    }
}
