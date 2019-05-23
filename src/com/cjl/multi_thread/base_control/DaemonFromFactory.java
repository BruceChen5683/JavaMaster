package com.cjl.multi_thread.base_control;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

public class DaemonFromFactory implements Runnable{
    @Override
    public void run() {
        try{
            while (true){
                TimeUnit.MILLISECONDS.sleep(100);
                System.out.println("base_control.DaemonFromFactory.run "+ Thread.currentThread().getName());
//                throw new RuntimeException("");
            }
        }catch (RuntimeException e){
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println(".run finally");
            //后台线程 在不执行finally子句的情况下就会终止其run方法
            //1133汉化  一处错误
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = new DaemonThreadPoolExecutor();// Executors.newCachedThreadPool(new base_control.DaemonThreadFactory());
        for (int i = 0;i <5;i++) {
            executorService.execute(new DaemonFromFactory());
        }
        System.out.println("base_control.DaemonFromFactory.main started");
        try {
            TimeUnit.MILLISECONDS.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
