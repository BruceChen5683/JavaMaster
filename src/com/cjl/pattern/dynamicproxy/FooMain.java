package com.cjl.pattern.dynamicproxy;

import java.lang.reflect.Proxy;

/**
 * Created by chenjianliang on 2017/5/11.
 */
public class FooMain {
    public static void main(String[] args) {

        Foo foo = null;
        CommanProxy commanProxy = new CommanProxy();
        commanProxy.setObject(new FooImpl1());

        foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
                new Class[]{Foo.class},
                commanProxy);

        foo.print();

        commanProxy.setObject(new FooImpl2());

        foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
                new Class[]{Foo.class},
                commanProxy);

        foo.print();

        commanProxy.setObject(new FooImpl1());

        foo.print();


    }
}
