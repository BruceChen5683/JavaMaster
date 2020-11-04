package com.cjl.multi_thread.enjoystudy.lock;

import javax.xml.soap.Text;

public class TestWaitNotify {
    private static Empress empress = new Empress();

    private static class CheckKm extends Thread{
        @Override
        public void run() {
            empress.checkKm();
        }
    }

    private static class CheckState extends Thread{
        @Override
        public void run() {
            empress.checkState();
        }
    }
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            new CheckState().start();
        }
        for (int i = 0; i < 3; i++) {
            new CheckKm().start();
        }

        Thread.sleep(1000);
        empress.changeKm();

    }
}
