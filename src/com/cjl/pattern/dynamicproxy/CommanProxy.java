package com.cjl.pattern.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by chenjianliang on 2017/5/11.
 */
public class CommanProxy implements InvocationHandler{
    private Object object;

    public CommanProxy(Object object) {
        this.object = object;
    }

    public CommanProxy(){

    }

    public void setObject(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        method.invoke(object,args);
        return null;
    }
}
