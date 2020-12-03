package com.cjl.aspectj.cflow;

public class TestCfow {

    public void foo(){
        System.out.println("xfoo...");
    }

    public void bar(){
        foo();
        System.out.println("xbar...");
    }


    public void testMethod(){
        bar();
        foo();
    }
    public static void main(String[] args) {
        new TestCfow().testMethod();
    }
}
