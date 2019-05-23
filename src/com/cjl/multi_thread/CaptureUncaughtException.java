package com.cjl.multi_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CaptureUncaughtException {
    public static void main(String[] args) {
        System.out.println("CaptureUncaughtException.main "+ Thread.currentThread().getName());
            ExecutorService executorService = Executors.newCachedThreadPool(new HandlerThreadFactory());
            executorService.execute(new ExceptionThread());
//            executorService.shutdown();
    }
}
