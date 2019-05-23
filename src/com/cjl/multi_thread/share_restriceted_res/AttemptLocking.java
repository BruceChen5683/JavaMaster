package com.cjl.multi_thread.share_restriceted_res;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class AttemptLocking {
    private ReentrantLock lock = new ReentrantLock();
    public void untimed(){
        System.out.println("AttemptLocking.untimed");

        boolean captured = lock.tryLock();
        try {
            System.out.println("tryLock(): "+ captured);
        }finally {
            if (captured){
                lock.unlock();
            }
        }
    }

    public void timed(){
        System.out.println("AttemptLocking.timed");
        boolean captured = false;
        try {
            captured = lock.tryLock(2, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
//            e.printStackTrace();
            throw new RuntimeException(e);
        }
        try {
            System.out.println("tryLock 2 seconds： "+captured);
        }finally {
            if (captured){
                lock.unlock();
            }
        }
    }

    private static String getExecutingMethodName() {
               StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();

                for (StackTraceElement e:
                     stackTrace) {
                    System.out.println("AttemptLocking.getExecutingMethodName :"+ e.getMethodName());
                }

                 StackTraceElement e = stackTrace[2];
                 return e.getMethodName();
            }

    public static void main(String[] args) {
        final AttemptLocking attemptLocking = new AttemptLocking();

//        attemptLocking.untimed();
//        attemptLocking.timed();

        new Thread(){
            //TODO  此处构造？
            {
                setDaemon(true);
            }


            @Override
            public void run() {
                System.out.println("AttemptLocking.run -----");
                attemptLocking.lock.lock();
//                attemptLocking.lock.unlock();
                System.out.println("acquired");
            }
        }.start();

        Thread.yield();

//        try {
//            Thread.sleep(3000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        attemptLocking.untimed();
        attemptLocking.timed();


    }
}
