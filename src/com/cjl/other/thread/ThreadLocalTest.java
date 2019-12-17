package com.cjl.other.thread;

public class ThreadLocalTest {


    static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
        @Override
        protected Integer initialValue() {
            return 3;
        }
    };

    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {
            int finalI = i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Integer s = threadLocal.get() + finalI;
                    threadLocal.set(s);
                    System.out.println("s "+threadLocal.get());
                }
            }).start();
        }

    }
}
