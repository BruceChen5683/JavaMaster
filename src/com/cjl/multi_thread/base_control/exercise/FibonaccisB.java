package com.cjl.multi_thread.base_control.exercise;

import source.Fibonacci;

import java.util.concurrent.Callable;

public class FibonaccisB implements Callable<Integer>{

    private int n,length;
    private int[] result;

    public FibonaccisB(int n){
        if (n <= 0){
            throw new RuntimeException("n invalid,must  > 0");
        }
        this.n = n;
        this.length = n;
        result = new int[n];

        getFibonaccis();

    }

    public FibonaccisB getFibonaccis(){
        Fibonacci fibonacci = new Fibonacci();
        while (n > 0){
            result[length - n] = fibonacci.next();
            n--;
        }

        return this;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[ ");
        for (int i = 0;i < length;i++){
            stringBuilder.append(result[i] + " ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0;i <length;i++){
            sum += result[i];
        }
        return sum;
    }
}
