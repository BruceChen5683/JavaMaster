package com.cjl.exception;

import java.awt.*;

/**
 * Created by chenjianliang on 2017/5/16.
 */
public class ExceptionTest {
//    Throwable
//    Error
//    Exception
//    ClassCastException
//    ClassNotFoundException
//    IndexOutOfBoundsException
//    OutOfMemoryError
//    NullPointerException

    public void set() throws Exception{
        throw  new MyException("哈哈");
    }

    public static void main(String[] args){

//
//        ExceptionTest exceptionTest = new ExceptionTest();
//        try {
//            exceptionTest.set();
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            System.out.println("ddddd");
//        }

        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread thread, Throwable throwable) {
                System.out.println("thread = " + thread.getName() + ", throwable = " + throwable.getMessage());
            }
        });


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                int i = 1/0;

            }},"child").start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("end ...");
            }
        },"other child").start();

        int i = 1/0;

        try {
            Thread.sleep(8000);
            System.out.println("end main 8s");
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.out.println("exception "+e.getMessage());
        }
    }

}
