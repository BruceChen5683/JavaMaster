package com.cjl.multi_thread.share_restriceted_res.exercise;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NumRangeChecker11 implements Runnable { // task(s) that depend on & share NumRangeGenerator
    private NumRangeGenerator generator;
    private final int id;
    public NumRangeChecker11(NumRangeGenerator g, int ident) {
        generator = g;
        id = ident;
    }
    public void run() {
        System.out.println("Testing.."+ generator);
        while(!generator.isCanceled()) {
            int[] range = generator.next();
            if( range[0] > range[1]) {
                System.out.println("Error in test #" + id + ": min " + range[0]
                        + " > " + "max " + range[1] );
                generator.cancel();
            }
        }
    }
    public static void test(NumRangeGenerator gen, int count) {
        System.out.println("Press Ctrl-C to exit");
        ExecutorService exec = Executors.newCachedThreadPool();
        for(int i = 0; i < count; i++)
            exec.execute(new NumRangeChecker11(gen, i));
        exec.shutdown();
    }
    public static void test(NumRangeGenerator gen) {
        test(gen, 10);
    }
}
