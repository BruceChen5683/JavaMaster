package com.cjl.pattern.adapter2;

/*
*
* 对象组合   适配器模式
* */
public class Adapter implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        adaptee.method2();
    }
}
