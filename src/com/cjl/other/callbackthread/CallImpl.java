package com.cjl.other.callbackthread;
public class CallImpl{

    private CallBack callBack;

    public CallImpl(){

    }

    public void go(){
        System.out.println("CallImpl.go ");
        /**
         * Main thread
         */
        callBack.callback();

        /**
         * child thread
         */
        new Thread(new Runnable() {
            @Override
            public void run() {
                callBack.callback();
            }
        },"myname").start();
    }

    public CallBack getCallBack() {
        return callBack;
    }

    public void setCallBack(CallBack callBack) {
        this.callBack = callBack;
    }
}
