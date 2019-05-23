package com.cjl.multi_thread.terminal_task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class OrnamentalGarden {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0;i < 5;i++){
            executorService.execute(new Entrance(i));
        }
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Entrance.cancel();
        executorService.shutdown();
        try {
            if (!executorService.awaitTermination(250,TimeUnit.MILLISECONDS)){
                System.out.println("Some tasks were not terminated");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("OrnamentalGarden.main Total "+Entrance.getTotalCount());
        System.out.println("Sum on Entrances :"+Entrance.sumEntrances());

    }
}
