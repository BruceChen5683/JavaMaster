package com.cjl.interview;

public class ThreadTest3 {
    public static void main(String[] args) {
        C c = new C();

        Thread thread1 = new T1(c);

        c = new C();

        Thread thread2 = new T2(c);

        thread1.start();
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        thread2.start();
    }
}

class C{
    public synchronized static void hello(){
        try {
            Thread.sleep(5000);
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("hello");
    }

    public synchronized void world(){
        System.out.println("world");
    }
}


class T1 extends Thread{
    private C c;

    public T1(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.hello();
    }
}

class T2 extends Thread{
    private C c;

    public T2(C c) {
        this.c = c;
    }

    @Override
    public void run() {
        c.world();
    }
}
