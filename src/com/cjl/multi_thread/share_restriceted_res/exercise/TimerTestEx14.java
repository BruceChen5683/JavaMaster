package com.cjl.multi_thread.share_restriceted_res.exercise;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TimerTestEx14  implements Runnable{

    private static int timers = 0;
    private static int tasks = 0;

    @Override
    public void run() {
        try {
            while (timers <4000){
                ++timers;
                Timer t = new Timer();
                t.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        ++tasks;
                        if (timers % 100 == 0){
                            System.out.println(timers + " timers did "
                                    + tasks + " tasks");
                        }
                    }
                },0);

                try {
                    TimeUnit.MILLISECONDS.sleep(30);//timer to do task
                }catch (InterruptedException e){
                    System.out.println("TimerTestEx14. Sleep interrupterd");
                }
                t.cancel();
            }
        }finally {
            System.out.println("Done. " + timers + " timers completed "
                    + tasks + " tasks");
        }
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new TimerTestEx14());
        executorService.shutdown();
    }
}
