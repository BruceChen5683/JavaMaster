package com.cjl.pattern.singleton.test;

import com.cjl.pattern.singleton.NotSingleton;
import com.cjl.pattern.singleton.Singleton1;

public class Test {
    public static void main(String[] args) {
        Singleton1.getInstance();
        Singleton1.getInstance();
        Singleton1.getInstance();

        //构造函数 创建对象时，才会调用
        NotSingleton.getmNotSingleton();
        NotSingleton.getmNotSingleton();
        NotSingleton.getmNotSingleton();

        NotSingleton.getSmNotSingleton();
        NotSingleton.getSmNotSingleton();
        NotSingleton.getSmNotSingleton();


    }
}
