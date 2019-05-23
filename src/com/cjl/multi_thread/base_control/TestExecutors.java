package com.cjl.multi_thread.base_control;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class TestExecutors {
    static int i = 0;
    static class MyThread implements Runnable{
        @Override
        public void run() {
            i++;
            System.out.println("MyThread.run");
            if (i == 1){
                throw new RuntimeException("none ");
            }
        }
    }

    static class MyThreadfactory implements ThreadFactory{

        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            System.out.println("newThread");
            return thread;
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool(new MyThreadfactory());
        executorService.execute(new MyThread());
    }
}
