package com.cjl.multi_thread.enjoystudy;

/**
 *  thread  interrupt() 请求中断------------
 *  isInterrupted() 当前线程是否处于中断，不清除标志位------------
 *
 *  Thread.interrupted()  清除标志位，isInterrupted()返回false
 *
 */
public class TestInterrupt {

    private static class InterruptThread extends Thread{
        @Override
        public void run() {

//            while (true){
//                System.out.println("run");
//            }

            while (!isInterrupted()){
                System.out.println(Thread.currentThread().getName()+" run");
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("after InterruptedException isInterrupted "+isInterrupted());
                    interrupt();
                    System.out.println("after InterruptedException ,reset interrupt isInterrupted "+isInterrupted());

//                    Thread.interrupted();
//                    System.out.println("after Thread.interrupted(),ClearInterrupted  "+isInterrupted());


                }
            }
            System.out.println("isInterrupted "+isInterrupted());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new InterruptThread();
        thread.start();
        Thread.sleep(50);
        thread.interrupt();
    }
}
