package com.cjl.multi_thread.share_restriceted_res;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ex15 {
    private Object object1 = new Object();
    private Object object2 = new Object();
    private Object object3 = new Object();
    private Object object = new Object();
    private Lock lock = new ReentrantLock();

    private Lock lock2 = new ReentrantLock();
    private Lock lock1 = new ReentrantLock();
    private Lock lock3 = new ReentrantLock();
    public void a(){
//        synchronized (object){
        lock.lock();
        try {
            for (int i = 0 ;i < 10;i++){
                System.out.println("Ex15.a");
                Thread.yield();
            }
        }finally {
            lock.unlock();
        }

//        }
    }

    public void b(){
//        synchronized (object) {
        lock1.lock();
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Ex15.b");
                Thread.yield();
            }
        }finally {
            lock1.unlock();
        }
//        }
    }

    public void c(){
//        synchronized (object){
        lock2.lock();
        try {
            for (int i = 0 ;i < 10;i++){
                System.out.println("Ex15.c");
                Thread.yield();
            }
        }finally {
            lock2.unlock();
        }

//        }
    }

    public static void main(String[] args) {
        final Ex15 ex15 = new Ex15();
        new Thread(new Runnable() {
            @Override
            public void run() {
                ex15.a();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                ex15.b();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                ex15.c();
            }
        }).start();

    }
}
