package com.cjl.aspectj.annotation;

public class None {

//    @TimeLogCCC(haha = "hhhhhh")
    @TimeLog(module = "player",num = 3)
    public void abc(){
        System.out.println("None.abc");
    }

    @TimeLog(module = "launcher",num = 4)
    public void def(){
        System.out.println("None.def");
    }
}
