package com.cjl.pattern.wrapper;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class ConcreatDecoratorTestInterfaceA extends DecoratorTestInterface{

    public ConcreatDecoratorTestInterfaceA(TestInterface testInterface) {
        super(testInterface);
    }

    @Override
    public void set() {
        super.set();
        this.get();
    }

    private void get(){
        System.out.println("ConcreatDecoratorTestInterfaceA.get BBBB");
    }
}
