package com.cjl.other.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Client {
    public static void main(String[] args) {
//        Thread threadB = new ThredB();
//        Thread threadA = new ThreadA(threadB);
//        threadA.start();
//        threadB.start();

        for (int i = 0; i < 20; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Client.run "+ finalI);
                }
            }).start();
        }
        FutureTask futureTask = new FutureTask(new Callable() {
            @Override
            public String call() throws Exception {
                Thread.sleep(5000);
                return "none";
            }
        });
        Thread thread = new Thread(futureTask);
        System.out.println("Client.main "+System.currentTimeMillis());
        thread.start();
        System.out.println("Client.main "+System.currentTimeMillis());

        try {
            futureTask.get();
            System.out.println("Client.main "+System.currentTimeMillis());

        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

//        Runtime.getRuntime().availableProcessors();

    }

}


class ThreadA extends Thread{
    private Thread thread;
    public ThreadA(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0;i < 10;i++){
            System.out.println("ThreadA.run i "+i);
            if(i == 5){
                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

class ThredB extends Thread{
    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("ThredB.run---------------");
    }
}
