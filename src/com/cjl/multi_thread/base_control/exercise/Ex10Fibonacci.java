package com.cjl.multi_thread.base_control.exercise;

import java.util.concurrent.*;

class Ex10Fibonacci implements Callable<Integer> {
    private Integer n = 0;
    ExecutorService exec = Executors.newSingleThreadExecutor();
    private int fib(int x) {
        if(x < 2) return 1;
        return fib(x - 2) + fib(x - 1);
    }
    public Integer call() {
        int result = 0;
        for(int i = 0; i < n; i++)
            result += fib(i);
        return (Integer)result;
    }
    public Future<Integer> runTask(Integer n) {
        this.n = n;
        return exec.submit(this);
    }


    public static void main(String[] args) {
        Ex10Fibonacci fib = new Ex10Fibonacci();
        try {
            for(int i = 0; i < 15; i++) {
                System.out.println("Sum of first " + i +
                                " Fibonacci numbers = ");

                System.out.println(fib.runTask(i).get());

            }
        } catch(InterruptedException e) {
            System.out.println(e);
            return;
        } catch(ExecutionException e) {
            System.out.println(e);
        } finally {
            fib.exec.shutdown();
        }
    }
}
