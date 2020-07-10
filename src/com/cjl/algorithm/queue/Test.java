package com.cjl.algorithm.queue;

import java.util.concurrent.*;

/**
 * 线程池运行
 * cool 3,max 6,Queue 10
 * 1-20.
 * cool 1-3
 * Queue 4-13
 * max 14-16
 * Reject 17-20
 */

public class Test {
    public static void main(String[] args) {

        BlockingQueue<Runnable> workQueue = new ArrayBlockingQueue<Runnable>(10);

        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 6, 3, TimeUnit.SECONDS,
                workQueue, new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
                if (r instanceof  MyRunnabel){
                    System.out.println("rejectedExecution "+((MyRunnabel) r).i);
                }
            }
        });

        for (int i = 1; i < 21; i++) {
            int finalI = i;
            threadPoolExecutor.execute(new MyRunnabel(i));
        }


    }

    static class MyRunnabel implements Runnable{
        private int i ;

        public MyRunnabel(int i) {
            this.i = i;
        }

        @Override
        public void run() {
            System.out.println("i :"+i);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
