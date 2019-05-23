package com.cjl.multi_thread.share_restriceted_res;

public class DualSynch {
    private Object syncObject = new Object();
    public synchronized void f(){
        for (int i = 0;i < 5;i++){
            System.out.println("DualSynch.f");
            Thread.yield();
        }
    }

    public void g(){
        synchronized (syncObject){
            for (int i = 0;i < 5;i++){
                System.out.println("DualSynch.g");
                Thread.yield();
            }
        }
    }


    public static void main(String[] args) {
        final DualSynch dualSynch = new DualSynch();
        new Thread(new Runnable() {
            @Override
            public void run() {
                dualSynch.f();
            }
        }).start();
        dualSynch.g();
    }
}
