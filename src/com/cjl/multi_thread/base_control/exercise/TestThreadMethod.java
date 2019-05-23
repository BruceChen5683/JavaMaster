package com.cjl.multi_thread.base_control.exercise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestThreadMethod {
    private ExecutorService executorService = Executors.newCachedThreadPool();
    public TestThreadMethod(){

    }
    private Future<Integer> runTask(int n){
        return executorService.submit(new FibonaccisB(n));
    }

    public static void main(String[] args) {
        TestThreadMethod testThreadMethod = new TestThreadMethod();
        for (int i=1;i < 15;i ++){
            try {
                System.out.println("TestThreadMethod.main "+testThreadMethod.runTask(i).get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }
    }

}
