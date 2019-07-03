package com.cjl.pattern.proxymode;

/**
 * Created by chenjianliang on 2017/5/10.
 * 代理模式  代理角色
 */
public class ProxySubject extends Subject{
    private RealSubject realSubject;//真实角色
    @Override
    public void request() {

        preRequest();//真实角色请求前的操作  可有可无

        if(realSubject == null){
            realSubject = new RealSubject();
        }
        realSubject.request();

        afterReRequest();//真实角色请后的操作  可有可无
    }

    //额外操作
    private void preRequest(){
        System.out.println("收费");
    }

    private void afterReRequest(){
        System.out.println("签合同");
    }
}
