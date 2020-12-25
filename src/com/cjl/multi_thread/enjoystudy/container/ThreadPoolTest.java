package com.cjl.multi_thread.enjoystudy.container;

import java.util.Random;

public class ThreadPoolTest {
    public static void main(String[] args) {

        BCThreadPool threadPool = new BCThreadPool(3,10);

        for (int i = 0; i < 20; i++) {
            int finalI = i;
            threadPool.execute(()->{
                try {
                    Thread.sleep(500);
                    System.out.println("run i "+finalI);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
        }

    }
}
