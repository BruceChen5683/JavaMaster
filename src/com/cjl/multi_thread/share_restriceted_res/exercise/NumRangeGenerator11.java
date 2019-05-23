package com.cjl.multi_thread.share_restriceted_res.exercise;

import java.util.Random;

public class NumRangeGenerator11 extends NumRangeGenerator {
    private int min = 0;
    private int max = 0;
    private int[] range = { min, max };
    private Random rand = new Random();
    public int[] next() { // oops, method should be synchronized
        min = rand.nextInt(100);
        max = rand.nextInt(100);
        Thread.yield();
        if(min > max) max = min;
        int[] ia = { min, max };
        return ia;
    }
    public static void main(String[] args) {
        NumRangeChecker11.test(new NumRangeGenerator11());
    }
}
