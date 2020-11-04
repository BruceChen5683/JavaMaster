package com.cjl.multi_thread.enjoystudy.lock;

/**
 * 等待和通知标准范式
 *
 * 等待方:
 *      获取对象的锁
 *      循环里判断条件是否满足，不满足调用wait方法
 *      条件满足执行业务
 *  通知方：
 *      获取对象的锁
 *      改变条件
 *      通知所有等待在对象上的线程
 *
 */
public class Empress {
    private String state = "Sh";
    private int km = 0;

    public synchronized void checkState()  {
        while (!state.equals("Bj")){
            try {
                wait();
                System.out.println("checkState Thread :"+Thread.currentThread().getId() + "" +
                        "is be notified");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("now in  "+state);
    }

    public synchronized void checkKm(){
        while (km <= 100){
            try {
                wait();
                System.out.println("checkKm Thread :"+Thread.currentThread().getId() + "" +
                        "is be notified");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("km now is > 100,"+km);
    }

    public synchronized void changeState(){
        this.state = "Bj";
        notifyAll();
    }

    public synchronized void changeKm(){
        this.km = 101;
        notifyAll();
    }
}
