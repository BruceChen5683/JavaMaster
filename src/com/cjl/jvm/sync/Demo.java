package com.cjl.jvm.sync;

public class Demo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        for (int i = 0; i < 5; i++) {
            new Thread(ticket).start();
        }
//        Thread t1 = new Thread(ticket);
//        Thread t2 = new Thread(ticket);
//        Thread t3 = new Thread(ticket);
//        t1.start();
//        t2.start();
//        t3.start();

    }
}
