package com.cjl.multi_thread.base_control;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestMultiUncaughtExceptionHandler {
    public static void main(String[] args) {
        Thread.setDefaultUncaughtExceptionHandler(new DefaultUncaughtExceptionHandler());
        ExecutorService executorService = Executors.newCachedThreadPool(new HandlerThreadFactory());
        executorService.execute(new ExceptionThread());

        //优先级     线程专有的handler >  线程组 的handler  > 默认的handler

    }
}
