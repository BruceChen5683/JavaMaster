package com.cjl.pattern.bridge.actualcombat;

public class SMSmsg implements MsgImp{
    @Override
    public void send(String msg, String user) {
        System.out.println("SMSmsg.send"+msg);
    }
}
