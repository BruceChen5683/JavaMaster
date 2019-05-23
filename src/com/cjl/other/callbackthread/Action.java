package com.cjl.other.callbackthread;

public class Action implements CallBack{
    private CallImpl call;

    public void init(){
        call = new CallImpl();
        call.setCallBack(this);
    }

    public void go(){
        call.go();
    }
    @Override
    public void callback() {
        System.out.println("Action.callback "+Thread.currentThread().getName());
    }
}
