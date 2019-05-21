package com.cjl.www;

public class ThreadTest2 {
    public static void main(String[] args) {
        Runnable runnable = new HelloThread();

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread1.start();
        thread2.start();
    }
}


class HelloThread implements Runnable{
    int i;

    @Override
    public void run() {
        i = 0;

        while (true){
            System.out.println("HelloThread.run number:"+i++);

            try {
                Thread.sleep((long) (Math.random()*1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            if (10 == i){
                break;
            }
        }
    }
    /**
     * 00123456789
     * 0123456789
     */
}

class HelloThread2 implements Runnable{
    int i;

    @Override
    public void run() {
        int i = 0;

        while (true){
            System.out.println("HelloThread.run number:"+i++);

            try {
                Thread.sleep((long) (Math.random()*1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            if (10 == i){
                break;
            }
        }
    }
    /**
     * ２０行输出
     */
}

class HelloThread3 implements Runnable{
    int i;

    @Override
    public void run() {

        while (true){
            System.out.println("HelloThread.run number:"+i++);

            try {
                Thread.sleep((long) (Math.random()*1000));
            }catch (InterruptedException e){
                e.printStackTrace();
            }

            if (10 == i){
                break;
            }
        }
    }
}
