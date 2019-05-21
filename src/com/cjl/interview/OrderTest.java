package com.cjl.interview;

public class OrderTest {
    public static void main(String[] args) {
        new Child();
//        Parent.static initializer blcok
//        Child.static initializer block
//        Parent.Parent constuctor
//        Child.Child constructor

        //父类静态代码块，子类静态代码块，父类构造，子类构造   静态先行
        //子类优先寻找父类不带参数的构造方法,若父类不存在带参数的构造方法  子类需要super带参数
    }
}

class Parent{
    static String name = "parent";

    static {
        System.out.println("Parent.static initializer blcok");
    }

    public Parent(){
        System.out.println("Parent.Parent constuctor");
    }

//    public Parent(String str){
//        System.out.println("Parent.Parent constuctor");
//    }
}

class Child extends Parent{
    static String childName = "child";

    static {
        System.out.println("Child.static initializer block");
    }

    public Child(){
        System.out.println("Child.Child constructor");
    }
}
