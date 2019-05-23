package com.cjl.multi_thread.exercise;

public class RunnableA implements Runnable{
    private int count = 3;
    private String name;

    public RunnableA(String name){
        this.name = name;
        System.out.println(name);
    }
    @Override
    public void run() {
        while (count -- > 0){
            System.out.println(name + "run count:"+ count);
            Thread.yield();
        }
        System.out.println(name + "run end");
    }
}
