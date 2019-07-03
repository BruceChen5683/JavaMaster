package com.cjl.multi_thread.old;

/**
 * Created by chenjianliang on 2017/5/27.
 */
public class ThreadTest4 {


    public static void main(String[] args) {
        Example example = new Example();
        Thread a = new ThreadAA(example);
        example = new Example();
        Thread b= new ThreadBB(example);

        a.start();
        b.start();
    }

}

class Example{

    public synchronized static void execute(){
        for (int i = 0;i < 20;i++){
            try {
                Thread.sleep((long)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("hi   "+i);
        }
    }

    public synchronized  static void execute2(){
        for (int i = 0;i < 20;i++){
            try {
                Thread.sleep((long)Math.random()*1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("girl   "+i);
        }
    }
}


class ThreadAA extends Thread{
    private Example example;
    public ThreadAA(Example example){
        this.example = example;
    }
    @Override
    public void run() {
//        Example.execute();
        example.execute();
    }
}

class ThreadBB extends Thread{
    private Example example;
    public ThreadBB(Example example){
        this.example = example;
    }
    @Override
    public void run() {
//        Example.execute2();
        example.execute2();
    }
}
