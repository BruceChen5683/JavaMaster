package com.cjl.pattern.templateMethod;

public class ConcreteClass extends AbstractClass{
    @Override
    public void method1() {
        System.out.println("ConcreteClass.method1 Step1");
    }

    @Override
    public void method2() {
        System.out.println("ConcreteClass.method1 Step2");

    }

    @Override
    public void method3() {
        System.out.println("ConcreteClass.method1 Step3");

    }
}
