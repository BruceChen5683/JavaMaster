package com.cjl.pattern.bridge.actualcombat;

public class Sysmsg implements MsgImp{
    @Override
    public void send(String msg, String user) {
        System.out.println("Sysmsg.send "+msg);
    }
}
