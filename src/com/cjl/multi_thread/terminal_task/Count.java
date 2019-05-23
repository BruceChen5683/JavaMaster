package com.cjl.multi_thread.terminal_task;

import java.util.Random;

public class Count {
    private int count = 0;
    private Random random = new Random(47);

    public synchronized int increment(){
        int temp = count;//增加失败的可能性
        if (random.nextBoolean()){
            Thread.yield();//增加失败的可能性
        }

        return (count = ++ temp);
    }

    public synchronized int value(){
        return count;
    }
}
