package com.cjl.multi_thread.base_control;

import java.io.IOException;

public class UnresponsiveUI {
    private volatile double d = 1;

    public UnresponsiveUI() {
        while (d >0){
            d = d + (Math.E + Math.PI)/d;
        }
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
