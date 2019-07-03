package com.cjl.pattern.templateMethod;

public abstract  class AbstractClass {

    public void template(){
        method1();
        method2();
        method3();
    }
    public abstract void method1();

    public abstract void method2();

    public abstract void method3();
}
