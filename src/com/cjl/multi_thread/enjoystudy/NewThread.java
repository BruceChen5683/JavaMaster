package com.cjl.multi_thread.enjoystudy;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * 多种创建Thread方法
 *
 * extends Thread
 * implements Runnable
 * implements Callable
 *          get操作，阻塞
 */
public class NewThread {

    private static class MyThread extends Thread{
        @Override
        public void run() {
            System.out.println("extends Thread");
        }
    }

    private static class MyRunnable implements Runnable{
        @Override
        public void run() {
            System.out.println("implements Runnable");
        }
    }

    private static class MyCallable implements Callable<String>{

        @Override
        public String call() throws Exception {
            Thread.sleep(1000);
            return "im callable,有返回值";
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new MyThread();
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        FutureTask<String> stringFutureTask = new FutureTask<>(new MyCallable());
        Thread thread3 = new Thread(stringFutureTask);
        thread3.start();
        try {
            long time = System.currentTimeMillis();
            System.out.println("before time "+time);
            String s = stringFutureTask.get();
            System.out.println("op get, cast time "+(System.currentTimeMillis()-time));
            System.out.println("s :"+s);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
