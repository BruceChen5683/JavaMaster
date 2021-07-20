package com.cjl.multi_thread.enjoystudy;

public class TestDameon {

    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                while (true){
//                    System.out.println("TestDameon.run");
//                }
//            }
//        });
//        thread.setDaemon(true);
//        thread.start();

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    System.out.println("run");
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException ...");
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
