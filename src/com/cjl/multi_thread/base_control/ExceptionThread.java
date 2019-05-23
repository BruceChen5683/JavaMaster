package com.cjl.multi_thread.base_control;

public class ExceptionThread implements Runnable{

    @Override
    public void run() {
        Thread t = Thread.currentThread();
        t.setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
//        System.out.println("base_control.ExceptionThread.run by "+ t);
//        System.out.println("base_control.ExceptionThread.run eh = "+ t.getUncaughtExceptionHandler());
//        throw new RuntimeException();
        int[] a = new int[10];
        int b = a[-2];
    }

//    public static void main(String[] args) {
//        try {
//            Executors.newCachedThreadPool()
//                    .execute(new base_control.ExceptionThread());
//        }catch (Exception e){
//            System.out.println("base_control.ExceptionThread.main has been handled");
//        }
//
//    }
}
