package com.cjl.multi_thread.share_restriceted_res;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class EvenChecker implements Runnable{
    private IntGenerator generator;
    private final int id;

    public EvenChecker(IntGenerator generator,int ident){
        this.generator = generator;
        this.id = ident;
    }

    @Override
    public void run() {
        while (!generator.isCanceled()){
            int val = generator.next();
            if (val % 2 == 0){
                System.out.println("ThreadName "+ Thread.currentThread().getName() +" ----- "+val + "not even");
                generator.cancel();
            }
        }
    }


    public static void test(IntGenerator intGenerator){
        test(intGenerator,10);
    }

    public static void test(IntGenerator intGenerator,int count){
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i =0 ; i < count;i++){
            executorService.execute(new EvenChecker(intGenerator,i));
        }
        executorService.shutdown();
    }
}
