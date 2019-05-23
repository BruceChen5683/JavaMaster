package com.cjl.multi_thread.terminal_task;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class Interrupting {
    private static ExecutorService executorService = Executors.newCachedThreadPool();

    static void test(Runnable r)throws InterruptedException{
        Future<?> f = executorService.submit(r);
        TimeUnit.MILLISECONDS.sleep(100);
        System.out.println("Interrupting.test Interrupting "+r.getClass().getSimpleName());
        f.cancel(true);
        System.out.println("Interrupting.test Interrupt send to "+r.getClass().getSimpleName());
    }

    public static void main(String[] args) {
        try {
            test(new SleepBlocked());
            test(new IOBlocked(System.in));
            test(new SynchronizedBlocked());

            TimeUnit.SECONDS.sleep(3);

            System.out.println("Interrupting.main aborting");
            System.exit(0);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
