package com.cjl.multi_thread.base_control.exercise;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestFibonacci {

    public static void main(String[] args) {
//        for (int i = 3;i < 20;i+=5){
//
//            int finalI = i;
//            Thread thread = new Thread(new Runnable() {
//                @Override
//                public void run() {
//                    FibonaccisB fibonacci = new FibonaccisB(finalI);
//                    System.out.println("TestFibonacci.run  "+ fibonacci.getFibonaccis());
//                }
//            });
//            thread.start();
//
//        }


        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 3;i < 20;i+=5){
            FibonaccisB fibonaccisB = new FibonaccisB(i);

            System.out.println("TestFibonacci.main "+ fibonaccisB.getFibonaccis());

            try {
                System.out.println("TestFibonacci.main "+ executorService.submit(fibonaccisB).get());
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ExecutionException e) {
                e.printStackTrace();
            }
        }

    }


}
