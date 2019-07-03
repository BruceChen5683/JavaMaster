package com.cjl.multi_thread.old;

/**
 * Created by chenjianliang on 2017/5/25.
 */
public class ThreadTest {
    public static void main(String[] args) {
        Thread threadA = new ThreadA();
        Thread threadB = new Thread(new RunnableB());

//        threadA.start();
        threadB.start();

//        System.out.println(threadA.getName());
        System.out.println(threadB.getName());


    }
}


class ThreadA extends Thread{

    public ThreadA() {
        super("AA");
    }

    @Override
    public void run() {
//        super.run();
        for (int i=0;i < 100;i++){
            System.out.println("ThreadAAAAA run");
        }
    }
}

class RunnableB implements Runnable{

    private boolean flag = true;

    @Override
    public void run() {
        for (int i=0;i < 100 && flag;i++){
            if(i == 10){
                stopRunning();
            }
            System.out.println("RunnableB run  "+i);
        }
    }

    public void stopRunning(){
        flag = false;
    }
}
