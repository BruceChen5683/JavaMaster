package com.cjl.multi_thread;

import java.io.IOException;

public class ResponsiveUI extends Thread{
    private static volatile double d = 1;

    public ResponsiveUI(){
        setDaemon(true);
        start();
    }

    @Override
    public void run() {
        while (true){
            d = d + (Math.PI + Math.E) / d;
        }
    }

    public static void main(String[] args) {
//        new UnresponsiveUI();
        new ResponsiveUI();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(d);
    }
}