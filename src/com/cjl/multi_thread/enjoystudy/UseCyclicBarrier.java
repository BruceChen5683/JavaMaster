package com.cjl.multi_thread.enjoystudy;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class UseCyclicBarrier {
    private static CyclicBarrier cyclicBarrier = new CyclicBarrier(10);

    static class Player extends Thread{
        @Override
        public void run() {
            Random random = new Random();
            try {
                Thread.sleep(random.nextInt(1000));
                System.out.println("thread "+Thread.currentThread().getId()+"  wait");
                cyclicBarrier.await();
                System.out.println("thread "+Thread.currentThread().getId()+" do work");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Player().start();
        }
        System.out.println("main start");
    }
}
