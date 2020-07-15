package com.cjl.jvm.sync;

public class Ticket implements Runnable{
    private int ticket = 10;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (ticket > 0){
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("卖票 ticket = "+ticket--);
            }
        }
    }

    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for (int i = 0; i < 5; i++) {
            new Thread(ticket).start();
        }
    }
}
