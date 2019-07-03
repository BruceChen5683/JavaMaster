package com.cjl.pattern.bridge.actualcombat;

public class Emailmsg implements MsgImp{
    @Override
    public void send(String msg, String user) {
        System.out.println("Emailmsg.send"+msg);
    }
}
