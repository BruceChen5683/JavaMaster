package com.cjl.multi_thread.enjoystudy;

public class TestDameon {

    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("run");
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    System.out.println("finally ...");
                }
            }
        });
        th.setDaemon(true);
        th.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("end");
    }
}
