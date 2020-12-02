package com.cjl.multi_thread.enjoystudy.atomic;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

public class UseAtomicInteger {
//    static AtomicInteger integer = new AtomicInteger(0);
    static int count = 0;

    private static class MThread extends Thread{
        @Override
        public void run() {
//            integer.getAndIncrement();
//            System.out.println(integer.get());
            try {
                Thread.sleep(new Random().nextInt(10));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count++;
            System.out.println(count);
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread = new MThread();
            thread.start();
        }
    }
}
