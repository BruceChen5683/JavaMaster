package com.cjl.multi_thread;

import java.util.concurrent.ThreadFactory;

public class HandlerThreadFactory implements ThreadFactory{

    @Override
    public Thread newThread(Runnable r) {
        System.out.println("creating new Thread");
        Thread t = new Thread(r);
        System.out.println("created "+ t.getName());
        t.setUncaughtExceptionHandler(new ThreadFactoryUncaughtExceptionHandler());
        System.out.println("eh =  "+t.getUncaughtExceptionHandler());
        return t;
    }
}
