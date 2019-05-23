package com.cjl.multi_thread.base_control.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestSimplePriorities implements Runnable {
    //优先级以及让步yield不一定有效
    private int countDown = 5;
    private volatile double d;

    @Override
    public String toString() {
        return Thread.currentThread() + ":" + countDown;
    }

    @Override
    public void run() {
        System.out.println("TestSimplePriorities.run "+Thread.currentThread().getPriority());
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool(new TestPriporityThreadFactory(Thread.NORM_PRIORITY));
        for (int i =0 ;i < 5;i++){
            executorService.execute(new TestSimplePriorities());
        }
        executorService.execute(new TestSimplePriorities());
        executorService.shutdown();
    }
}
