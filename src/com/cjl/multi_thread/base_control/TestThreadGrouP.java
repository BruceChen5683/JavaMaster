package com.cjl.multi_thread.base_control;

public class TestThreadGrouP {
    public static void main(String[] args) {
        MyThread mt0 = new MyThread();
        MyThread mt1 = new MyThread();
        ThreadGroup tg = new ThreadGroup("新建线程组1");
        Thread t0 = new Thread(tg, mt0);
        Thread t1 = new Thread(tg, mt1);
        t0.start();
        t1.start();
        System.out.println("活动的线程数为：" + tg.activeCount());
        System.out.println("线程组的名称为：" + tg.getName());
    }

    static class MyThread implements Runnable{

        public void run()
        {
            try
            {
                while (!Thread.currentThread().isInterrupted())
                {
                    System.out.println("ThreadName = " + Thread.currentThread().getName());
                    Thread.sleep(3000);
                }
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}
