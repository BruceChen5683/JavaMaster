package com.cjl.pattern.proxymode;

/**
 * Created by chenjianliang on 2017/5/10.
 */
public class Client {

    public static void main(String[] args) {
        Subject subject = new ProxySubject();
        subject.request();

//        InvocationHandler
//        Proxy
    }
}
