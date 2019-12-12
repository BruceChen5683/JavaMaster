package com.cjl.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by chenjianliang on 2017/5/10.
 */
public class DynamicProxySubject implements InvocationHandler {
    private Object sub;

    public Object getSub() {
        return sub;
    }

    public void setSub(Object sub) {
        this.sub = sub;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(sub.getClass().getClassLoader(),
                sub.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("before call   "+method);

        System.out.println("proxy.getClass() = " + proxy.getClass());

        Object object = method.invoke(sub,args);
        System.out.println("after call   "+method);
        return object;
    }

}
