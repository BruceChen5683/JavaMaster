package com.cjl.multi_thread.enjoystudy;

import java.util.ArrayList;
import java.util.List;

/**
 *         NEW,
 *         RUNNABLE,
 *         BLOCKED,
 *         WAITING,
 *         TIMED_WAITING,
 *         TERMINATED;
 */
public class ThreadState {
    public static void main(String[] args) throws InterruptedException {
//        Thread thread = new Thread(new RunnableA());
//        thread.start();
//
//        try {
//            Thread.sleep(3000);
//            System.out.println("in sleep");
//            printState(thread);
//            thread.interrupt();
//            System.out.println("after interrupt");
//            printState(thread);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        Express express = new Express(0,Express.CITY);

        Thread checkKm = new Thread(new Runnable() {
            @Override
            public void run() {
                express.waitKm();
            }
        });

        Thread checkSite = new Thread(new Runnable() {
            @Override
            public void run() {
                express.waitSite();
            }
        });

        List<Thread> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new Thread(checkKm));
        }

        for (int i = 0; i < 3; i++) {
            list.add(new Thread(checkSite));
        }


        for (int i = 0; i < list.size(); i++) {
            list.get(i).start();
        }

        printState(list.get(0));

        Thread.sleep(2000);
        express.changeKm();
        for (int i = 0; i < list.size(); i++) {
            printState(list.get(i));
        }

        Thread.sleep(2000);
        for (int i = 0; i < list.size(); i++) {
            printState(list.get(i));
        }

    }

    private static void printState(Thread thread) {
        if (thread == null){
            throw new RuntimeException("thread is null");
        }

        switch (thread.getState()){
            case NEW:System.out.println("NEW ");break;
            case RUNNABLE:System.out.println("RUNNABLE ");break;
            case BLOCKED:System.out.println("BLOCKED ");break;
            case WAITING:System.out.println("WAITING ");break;
            case TIMED_WAITING:System.out.println("TIMED_WAITING ");break;
            case TERMINATED:System.out.println("TERMINATED ");break;
            default: System.out.println("UNKNOWN...");break;
        }
    }

    private static class RunnableA implements Runnable{

        @Override
        public void run() {
            System.out.println("run,before sleep ");
                printState(Thread.currentThread());
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            System.out.println("run,after sleep ");

                printState(Thread.currentThread());

        }
    }

    /**
     * a b
     */
    private static class Express{
        public static final String CITY = "SH";
        private int km;
        private String site;

        public Express(int km, String site) {
            this.km = km;
            this.site = site;
        }

        /**
         * 通知
         */
        public synchronized void changeKm(){
            this.km = 101;
            notifyAll();
        }

        public synchronized void changeSite(){
            this.site = "BJ";
            notify();
        }

        public synchronized void waitKm(){
            while (this.km <= 100){
                try {
                    wait();
                    System.out.printf("waitKm be notified,currentThreadID "+Thread.currentThread().getId());
                    printState(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Express.waitKm 执行业务...");
        }

        public synchronized void waitSite(){
            while (this.site.equals(CITY)){
                try {
                    wait();
                    System.out.printf("waitSite be notified,currentThreadID "+Thread.currentThread().getId());
                    printState(Thread.currentThread());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Express.waitSite 执行业务...");
        }
    }
}
