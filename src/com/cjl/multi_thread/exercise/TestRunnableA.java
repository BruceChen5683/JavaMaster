package com.cjl.multi_thread.exercise;

public class TestRunnableA {
    public static void main(String[] args) {
        for (int i = 0;i < 5;i++){
            RunnableA runnableA = new RunnableA("Thread "+i);
            new Thread(runnableA).start();
        }
    }
}
