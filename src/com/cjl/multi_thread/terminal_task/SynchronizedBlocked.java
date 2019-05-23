package com.cjl.multi_thread.terminal_task;

public class SynchronizedBlocked implements Runnable{

    public synchronized void f(){
        while (true){//Never release lock
            Thread.yield();
        }
    }

    public SynchronizedBlocked(){
        new Thread(){
            @Override
            public void run() {
                f();//lock acquired by this thread
            }
        }.start();
    }
    @Override
    public void run() {
        System.out.println("SynchronizedBlocked.run trying to call f()");
        f();
        System.out.println("SynchronizedBlocked.run Exiting");
    }
}
