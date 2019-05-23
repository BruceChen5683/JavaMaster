package com.cjl.multi_thread.base_control;

public class MoreBasicThreads8 {
    public static void main(String[] args) {
        try { // increase number of threads to see effect
            for(int i = 0; i < 25; i++) {
                Thread t = new Thread(new LiftOff());
                t.setDaemon(true);
                t.start();
            }
            System.out.println("Waiting for base_control.LiftOff");

        } finally {
            System.out.println("Finally out of main");
        }
    }
}
