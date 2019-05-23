package com.cjl.multi_thread.share_restriceted_res;

public class SerialNumberGenerator {
    private static volatile int serialNumber = 0;

    public static synchronized int nextSerialNumber(){
        return serialNumber++;//not thread-safe
    }
}
