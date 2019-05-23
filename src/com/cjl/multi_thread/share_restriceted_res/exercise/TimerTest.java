package com.cjl.multi_thread.share_restriceted_res.exercise;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TimerTest {

    static class MyTimer extends Timer{
        private long delay;
        private String name;

        public MyTimer(String name,long delay){
            this.delay = delay;
            this.name = name;
            start();
        }

        private void start(){
            this.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println(name+":run after "+delay);
                }
            },delay);
        }
    }

    public static void main(String[] args) {
        for (int i = 0;i < 10;i++){
            MyTimer timer = new MyTimer(new Random().nextInt(500)+"", new Random().nextInt(500));
        }
    }
}
