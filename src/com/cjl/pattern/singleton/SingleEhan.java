package com.cjl.pattern.singleton;

public class SingleEhan {
    private static SingleEhan singleEhan = new SingleEhan();

    private SingleEhan(){

    }

    public static SingleEhan getInstance(){
        return singleEhan;
    }
}
