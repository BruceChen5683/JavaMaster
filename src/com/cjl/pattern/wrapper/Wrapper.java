package com.cjl.pattern.wrapper;

import java.io.InputStreamReader;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class Wrapper {

    public static void main(String[] args) {
//        TestInterface testInterface = new ConcreateTestInterface();
//        ConcreatDecoratorTestInterfaceA concreatDecoratorTestInterfaceA = new ConcreatDecoratorTestInterfaceA(testInterface);
//
//        concreatDecoratorTestInterfaceA.set();
//
//        System.out.println("Wrapper.main00000000000");
//
//
//        ConcreateDecoratorTestInterFaceB BB = new ConcreateDecoratorTestInterFaceB(concreatDecoratorTestInterfaceA);
//        BB.set();


        TestInterface testInterface = new ConcreatDecoratorTestInterfaceA(new ConcreateDecoratorTestInterFaceB(new ConcreateTestInterface()));

        testInterface.set();

    }
}
