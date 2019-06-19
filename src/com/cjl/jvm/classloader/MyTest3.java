package com.cjl.jvm.classloader;

import java.util.UUID;

/**
 *  当一个常量的值，并非编译期间可以确定的，那么其值就不会被放到调用类的常量池中，
 *  这时在程序运行时，会导致主动使用这个常量所在的类，显示会导致这个类的初始化。
 */
public class MyTest3 {
    public static void main(String[] args) {
        System.out.println(Parent3.uuid);
    }
}

    class Parent3{
        public static final String  uuid = UUID.randomUUID().toString();

        static {
            System.out.println("Parent3.static initializer");
        }
}

//Parent3.static initializer
//e2b6347b-7028-4912-a9e6-3128bf5d0fc7
