package com.cjl.multi_thread.old;

import java.util.Map;

/**
 * Created by chenjianliang on 2017/5/28.
 */
public class ThreadTest6 {
    public static void main(String[] args) {
        Sum sum = new Sum();

        Thread threadIn1 = new Thread(new ThreadIn(sum),"AAA");
        Thread threadDe2 = new ThreadDe(sum,"BBB");
        Thread threadIn3 = new Thread(new ThreadIn(sum),"CCC");
        Thread threadDe4 = new ThreadDe(sum,"DDD");

        threadIn1.start();
        threadDe2.start();
        threadIn3.start();
        threadDe4.start();


    }
}


class Sum{
    private int i = 0;

    public synchronized void increase(){
        while (i != 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i++;

        System.out.println(i);

        notify();

//        return i;

    }
    public synchronized void decrease(){
        while (i == 0){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        i--;

        System.out.println(i);
        notify();
//        return i;
    }
}

class ThreadIn implements Runnable{

    private Sum sum;

    ThreadIn(Sum sum){
        this.sum = sum;
    }
    @Override
    public void run() {
        for (int i = 0;i < 20;i++){
            try {
                Thread.sleep((long) Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

//            System.out.println(Thread.currentThread().getName() +"  increase " +i);
            sum.increase();
        }
    }
}

class ThreadDe extends Thread{
    private Sum sum;
    ThreadDe(Sum sum){
        this.sum = sum;
    }

    ThreadDe(Sum sum,String name){
        super(name);
        this.sum = sum;
    }
    @Override
    public void run() {
        for (int i = 0;i < 20;i++){
            try {
                Thread.sleep((long) Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
//            System.out.println(Thread.currentThread().getName() +"  decrease " +i);
            sum.decrease();
        }
    }
}
