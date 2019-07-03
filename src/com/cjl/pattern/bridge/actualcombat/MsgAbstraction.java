package com.cjl.pattern.bridge.actualcombat;

public abstract class MsgAbstraction {
    protected MsgImp msgImp;

    public MsgAbstraction(MsgImp msgImp){
        this.msgImp = msgImp;
    }

    public void send(String msg,String user){
        msgImp.send(msg,user);
    }
}
