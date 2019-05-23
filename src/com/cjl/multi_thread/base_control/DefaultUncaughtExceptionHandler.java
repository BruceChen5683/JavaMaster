package com.cjl.multi_thread.base_control;

public class DefaultUncaughtExceptionHandler implements Thread.UncaughtExceptionHandler{
    @Override
    public void uncaughtException(Thread t, Throwable e) {
        System.out.println("base_control.DefaultUncaughtExceptionHandler "+ e);
    }
}
