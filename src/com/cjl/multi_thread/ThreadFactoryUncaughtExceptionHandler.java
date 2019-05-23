package com.cjl.multi_thread;

public class ThreadFactoryUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("ThreadFactoryUncaughtExceptionHandler "+ e);
    }
}
