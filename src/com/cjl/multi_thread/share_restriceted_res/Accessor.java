package com.cjl.multi_thread.share_restriceted_res;

import java.util.Random;

public class Accessor implements Runnable{
    private final int id;

    public Accessor(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        while (!Thread.currentThread().isInterrupted()){
            ThreadLocalVaiableHolder.increment();
            System.out.println("Accessor.run" + this);
            Thread.yield();
        }
    }

    @Override
    public String toString() {
        return "#"+id+":"+ThreadLocalVaiableHolder.get();

    }
}
