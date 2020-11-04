package com.cjl.multi_thread.enjoystudy;

import java.util.concurrent.CountDownLatch;

public class UseCountDownLatch {
    private static CountDownLatch countDownLatch = new CountDownLatch(6);

    private static class InitThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getId() + " is init");
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getId() + " after init do sth.");
        }
    }

    private static class Init2Thread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getId() + " step 1");
            countDownLatch.countDown();
            System.out.println(Thread.currentThread().getId() + " step 2");
            countDownLatch.countDown();
        }
    }

    private static class BusinessThread extends Thread{
        @Override
        public void run() {
            try {
                countDownLatch.await();
                System.out.println(Thread.currentThread().getId() + " do business");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        new BusinessThread().start();
        for (int i = 0; i < 6-2; i++) {
            InitThread thread = new InitThread();
            thread.start();
        }
        new Init2Thread().start();
        countDownLatch.await();

        System.out.println("Main do sth.");
    }
}
