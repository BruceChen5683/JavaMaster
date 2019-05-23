package com.cjl.multi_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExceptionThread implements Runnable{

    @Override
    public void run() {
//        Thread t = Thread.currentThread();
//        System.out.println("ExceptionThread.run by "+ t);
//        System.out.println("ExceptionThread.run eh = "+ t.getUncaughtExceptionHandler());
//        throw new RuntimeException();
        int[] a = new int[10];
        int b = a[-2];
    }

//    public static void main(String[] args) {
//        try {
//            Executors.newCachedThreadPool()
//                    .execute(new ExceptionThread());
//        }catch (Exception e){
//            System.out.println("ExceptionThread.main has been handled");
//        }
//
//    }
}
