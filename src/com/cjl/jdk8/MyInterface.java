package com.cjl.jdk8;


@FunctionalInterface
public interface MyInterface {

    void add();

    String toString();

    int hashCode();

    boolean equals(Object obj);

    //default
    default void set(MyInterface myInterface){
        System.out.println("MyInterface.set default");
        myInterface.add();
    }

    static void mystatic(){
        System.out.println("MyInterface.mystatic");
    }

}
