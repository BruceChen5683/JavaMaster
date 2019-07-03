package com.cjl.multi_thread.old.threadpools;

import java.util.concurrent.*;

public class ThreadPoolTest{

    public static void main(String[] args) {
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<Runnable>(4);
        ThreadPoolExecutor executor = new ThreadPoolExecutor(2,6,1, TimeUnit.DAYS,queue);
        for (int i = 0; i < 10;i++){
            executor.execute(new Thread(new MThread(),"Test----"+i));
            System.out.println("ThreadPoolTest.main   "+            queue.size());
        }
        executor.shutdown();
    }

    static class MThread implements Runnable{

        @Override
        public void run() {
            synchronized (this){
                try {
                    System.out.println("ThreadPoolTest.run "+ Thread.currentThread().getName());
                    Thread.sleep(3000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
