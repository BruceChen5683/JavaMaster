package com.cjl.multi_thread.base_control;

public class ThreadFactoryUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("base_control.ThreadFactoryUncaughtExceptionHandler "+ e);
    }
}
