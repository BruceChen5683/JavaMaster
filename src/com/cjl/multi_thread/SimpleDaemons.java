package com.cjl.multi_thread;

import java.util.concurrent.TimeUnit;

public class SimpleDaemons implements Runnable{
    @Override
    public void run() {
        try{
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println("SimpleDaemons.run "+ Thread.currentThread().getName());
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5;i++){
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("SimpleDaemons.main  started");

        try {
            TimeUnit.MILLISECONDS.sleep(150);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
