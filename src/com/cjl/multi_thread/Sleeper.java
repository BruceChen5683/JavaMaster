package com.cjl.multi_thread;

import java.util.concurrent.Executors;

public class Sleeper extends Thread{
    private int duration;
    public Sleeper(String name,int sleepTime){
        super(name);
        duration = sleepTime;
        start();
    }

    @Override
    public void run() {
        try {
            sleep(duration);
        }catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println(getName() + "Was interrupted. "+  "isInterrupted() "+isInterrupted());
            return;
        }
        System.out.println(getName() + "has awakened");
    }
}
