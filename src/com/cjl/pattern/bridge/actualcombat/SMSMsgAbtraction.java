package com.cjl.pattern.bridge.actualcombat;

public class SMSMsgAbtraction extends MsgAbstraction{

    public SMSMsgAbtraction(MsgImp msgImp) {
        super(msgImp);
    }

    @Override
    public void send(String msg, String user) {
        super.send(msg+"********", user);
    }
}
