package com.cjl.multi_thread.terminal_task;

import java.util.concurrent.TimeUnit;

public class SleepBlocked implements Runnable{
    @Override
    public void run() {
        try {
            TimeUnit.SECONDS.sleep(100);
        }catch (InterruptedException e){
            System.out.println("SleepBlocked.run InterruptedException");
        }
        System.out.println("SleepBlocked.run");
    }
}
