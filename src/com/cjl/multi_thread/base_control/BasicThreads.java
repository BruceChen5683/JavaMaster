package com.cjl.multi_thread.base_control;


import java.util.concurrent.*;

public class BasicThreads {
    public static void main(String[] args) {

        /**
         *
         */
        ExecutorService executorService = Executors.newCachedThreadPool();
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i = 0;i < 5;i++){
            executorService.execute(new LiftOff());
        }
        executorService.shutdown();
        System.out.println("base_control.BasicThreads.main");
    }
}
