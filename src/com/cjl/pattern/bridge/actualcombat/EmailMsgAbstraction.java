package com.cjl.pattern.bridge.actualcombat;

public class EmailMsgAbstraction extends MsgAbstraction{

    public EmailMsgAbstraction(MsgImp msgImp) {
        super(msgImp);
    }

    public void send(String msg,String user){
        super.send(msg+"----",user);
    }

}
