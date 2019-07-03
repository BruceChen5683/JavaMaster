package com.cjl.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by chenjianliang on 2017/5/10.
 */
public class Client {

    public static void main(String[] args) {
        RealSubject realSubject = new RealSubject();


        InvocationHandler handler = new DynamicProxySubject();

        Class<?> classType = handler.getClass();

        Subject subject = (Subject) Proxy.newProxyInstance(
                classType.getClassLoader(),
                 realSubject.getClass().getInterfaces(),
                handler);


        subject.request();

        System.out.println(subject.getClass());



        RealSubject2 realSubject2  = new RealSubject2();
        handler = new DynamicProxySubject(realSubject2);
        Subject2 subject2 = (Subject2) Proxy.newProxyInstance(
                realSubject2.getClass().getClassLoader(),
//                classType.getClassLoader(),
                realSubject2.getClass().getInterfaces(),
                handler);

        int t = subject2.set(10);
        System.out.println("t = " + t);


        System.out.println(realSubject.getClass().getClassLoader());
        System.out.println(realSubject2.getClass().getClassLoader());
        System.out.println(classType.getClassLoader());




    }
}
