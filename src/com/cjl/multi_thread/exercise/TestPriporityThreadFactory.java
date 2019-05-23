package com.cjl.multi_thread.exercise;

import java.util.concurrent.ThreadFactory;

public class TestPriporityThreadFactory implements ThreadFactory{
    private int pripority;
    public TestPriporityThreadFactory(int pripority){
        this.pripority = pripority;
    }
    @Override
    public Thread newThread(Runnable r) {
        Thread thread = new Thread(r);
        int a = (int) (Math.random()*3);
        switch (a){
            case 0:
                thread.setPriority(Thread.MIN_PRIORITY);
                break;
            case 1:
                thread.setPriority(Thread.NORM_PRIORITY);
                break;
            case 2:
                thread.setPriority(Thread.MAX_PRIORITY);
                break;
            default:break;
        }


        return thread;
    }
}
