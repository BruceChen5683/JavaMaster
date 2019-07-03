package com.cjl.multi_thread.old;

/**
 * Created by chenjianliang on 2017/5/26.
 */
public class ThreadTest2 {
    public static void main(String[] args) {
//        Thread thread = new ThreadNum();
//        thread.start();
        Runnable runnable = new MyRunnable();
        Thread threadA = new Thread(runnable);
//        runnable = new MyRunnable();
        Thread threadB = new Thread(runnable);
        threadA.start();
        threadB.start();


    }
}


class ThreadNum extends Thread{
    int i;
    @Override
    public void run() {
//        super.run();


        while (true){
            System.out.println("i++ = " + i++);

            try {
                Thread.sleep((long)((Math.random()*1000)));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            if(50 == i){
                break;
            }
        }

    }
}

class MyRunnable implements Runnable{


    @Override
    public void  run() {
        Integer i = 0;
        synchronized (i){
            while (true){
                System.out.println(Thread.currentThread().getName()+"i++ = " + i++);

                try {
                    Thread.sleep((long)((Math.random()*1000)));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(50 == i){
                    break;
                }
            }
        }

    }
}
