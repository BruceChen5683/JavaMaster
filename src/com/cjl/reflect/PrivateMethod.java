package com.cjl.reflect;

/**
 * Created by chenjianliang on 2017/5/10.
 */
public class PrivateMethod {

    private String name = "wgl";
    private String sayHello(String str){
        return "hello    "+str;
    }


    public String getName(){
        return name;
    }
}
