package com.cjl.pattern.singleton;

public class SingleDcl {
    private static volatile SingleDcl singleDcl;

    private SingleDcl(){

    }

    public SingleDcl getInstance(){
        if (singleDcl == null){
            synchronized (SingleDcl.class){
                singleDcl = new SingleDcl();
            }
        }
        return singleDcl;
    }
}
