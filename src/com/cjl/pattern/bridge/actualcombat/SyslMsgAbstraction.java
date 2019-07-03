package com.cjl.pattern.bridge.actualcombat;

public class SyslMsgAbstraction extends MsgAbstraction{

    public SyslMsgAbstraction(MsgImp msgImp) {
        super(msgImp);
    }

    public void send(String msg,String user){
        super.send(msg+"+++++",user);
    }

}
