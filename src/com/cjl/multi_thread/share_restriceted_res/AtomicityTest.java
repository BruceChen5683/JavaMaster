package com.cjl.multi_thread.share_restriceted_res;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicityTest implements Runnable{
//    private int i = 0;
    private AtomicInteger i = new AtomicInteger(0);
    public int getValue(){return i.get();}
    private synchronized void evenIncrement(){
//        i++;
//        i++;
        i.addAndGet(2);
    }
    @Override
    public void run() {
        while (true){
            evenIncrement();
        }
    }


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        AtomicityTest atomicityTest = new AtomicityTest();
        executorService.execute(atomicityTest);
        while (true){
            int val = atomicityTest.getValue();
            if (val %2 != 0){
                System.out.println("AtomicityTest.main "+ val);
                System.exit(0);
            }
        }
    }
}
