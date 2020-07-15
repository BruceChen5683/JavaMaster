package com.cjl.jvm.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockTest {
    public int inc = 0;
    private Lock lock = new ReentrantLock();

    public void increase() {
        try {
            lock.lock();
            inc++;
        }finally {
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        final LockTest test = new LockTest();
        for(int i=0;i<5;i++){
            new Thread(() -> {
                for(int j=0;j<10;j++){
                    test.increase();
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        }
    }

}
