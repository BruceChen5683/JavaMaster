package com.cjl.pattern.bridge.actualcombat;

public class Client {
    public static void main(String[] args) {
        MsgImp msgImp = new Sysmsg();
        MsgAbstraction msgAbstraction = new SyslMsgAbstraction(msgImp);
        msgAbstraction.send("11","yoyo");

        msgAbstraction = new EmailMsgAbstraction(msgImp);
        msgAbstraction.send("11","yoyo");

        msgImp = new Emailmsg();
        msgAbstraction = new SyslMsgAbstraction(msgImp);
        msgAbstraction.send("11","yoyo");

        msgAbstraction = new EmailMsgAbstraction(msgImp);
        msgAbstraction.send("11","yoyo");

        msgAbstraction = new SMSMsgAbtraction(msgImp);
        msgAbstraction.send("11","yoyo");

    }
}
