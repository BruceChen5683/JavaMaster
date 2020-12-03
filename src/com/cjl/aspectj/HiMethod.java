package com.cjl.aspectj;

public class HiMethod {

    public HiMethod method1(){
        System.out.println("m1");
        return this;
    }

    public HiMethod method2(int i){
        System.out.println("m2");
        return this;
    }

    public HiMethod method3(String a,int b){
        System.out.println("m3");
        return this;
    }

    public HiMethod method4(){
        System.out.println("m4");
        return this;
    }

    public static void main(String[] args) {
        HiMethod hiMethod = new HiMethod();
        hiMethod.method1();
        hiMethod.method2(0);
        hiMethod.method3("a",5);
        hiMethod.method4();
    }
}
