package com.cjl.multi_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SimplePriorities implements Runnable {
    //优先级以及让步yield不一定有效
    private int countDown = 5;
    private volatile double d;
    private int pripority;

    public SimplePriorities(int pripority){
        this.pripority = pripority;
    }

    @Override
    public String toString() {
        return Thread.currentThread() + ":" + countDown;
    }

    @Override
    public void run() {
        Thread.currentThread().setPriority(pripority);
        while (true){
            for (int i =0;i < 100000;i++){
                d += (Math.PI + Math.E)/(double)i;
                if (i % 1000 == 0){
                    Thread.yield();
                }
            }
            System.out.println(this);
            if (--countDown == 0){
                return;
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i =0 ;i < 5;i++){
            executorService.execute(new SimplePriorities(Thread.MIN_PRIORITY));
        }
        executorService.execute(new SimplePriorities(Thread.MAX_PRIORITY));
        executorService.shutdown();
    }
}
