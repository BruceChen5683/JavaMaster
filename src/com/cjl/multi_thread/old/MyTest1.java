package com.cjl.multi_thread.old;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyTest1 {
    public static void main(String[] args) {
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            final int index = i;
            try {
                Thread.sleep(index * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            cachedThreadPool.execute(new Thread(){
                @Override
                public void run() {
                    super.run();
                    System.out.println("MyThread.run  "+            this.getName());
                    System.out.println(index);
                }
            });
        }
    }

}
