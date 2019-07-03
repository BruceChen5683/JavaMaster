package com.cjl.multi_thread.old;

/**
 * Created by chenjianliang on 2017/5/27.
 */
public class ThreadTest5 {

//    static {
//        //...
//    }

    public static void main(String[] args) {
        Example2 example2 = new Example2();

        ThreadCC threadCC = new ThreadCC(example2);
        ThreadDD threadDD = new ThreadDD(example2);

        threadCC.start();
        threadDD.start();


    }

}

class Example2{

    private Object object = new Object();
    public void execute(){
            for (int i = 0;i < 20;i++){
                try {
                    Thread.sleep((long)Math.random()*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("hi   "+i);
            }

    }

    public void execute2(){
            for (int i = 0;i < 20;i++){
                try {
                    Thread.sleep((long)Math.random()*1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                System.out.println("girl   "+i);
            }


    }

//    private Object object = new Object();
//    public void execute(){
//        synchronized (this){//synchronized块
//            for (int i = 0;i < 20;i++){
//                try {
//                    Thread.sleep((long)Math.random()*1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println("hi   "+i);
//            }
//        }
//    }
//
//    public void execute2(){
//        synchronized (this) {
//            for (int i = 0;i < 20;i++){
//                try {
//                    Thread.sleep((long)Math.random()*1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println("girl   "+i);
//            }
//        }
//
//    }
}

class ThreadCC extends Thread{
    private Example2 example;
    public ThreadCC(Example2 example){
        this.example = example;
    }
    @Override
    public void run() {
//        Example.execute();
            example.execute();
    }
}

class ThreadDD extends Thread{
    private Example2 example;
    public ThreadDD(Example2 example){
        this.example = example;
    }
    @Override
    public void run() {
//        Example.execute2();
        example.execute2();
    }

}
