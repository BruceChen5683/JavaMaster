package com.cjl.reflect;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

/**
 * Created by chenjianliang on 2017/5/10.
 */
public class VectorProxy implements InvocationHandler{
    private Object proxyObj;

    public VectorProxy(Object proxyObj) {
        this.proxyObj = proxyObj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {


        System.out.println("befor calling"+method);
        if(args != null){
            for (Object obj:args){
                System.out.println("obj = " + obj);
            }
        }
        Object object = method.invoke(proxyObj,args);
        System.out.println("after calling"+method);


        System.out.println("object = " + object);
        return object;
    }

    public static Object factory(Object obj){
        Class<?> classType = obj.getClass();
        return Proxy.newProxyInstance(classType.getClassLoader(),
                classType.getInterfaces(), new VectorProxy(obj));
    }

    public static void main(String[] args) {
        List v = (List) factory(new Vector());
        if (v == null){
            System.out.println("nullll");
        }

        v.add("aa");
        v.add("bb");

        System.out.println("v.size() = " + v.size());

    }
}
