package com.cjl.www;

import java.io.FileInputStream;
import java.lang.reflect.Field;

public class PrivateTest {
    private String name = "hello";

    public String getName(){
        return name;
    }


    public static void main(String[] args) {
        try {
            Class clazz = Class.forName("com.cjl.www.PrivateTest");
            Field field = clazz.getDeclaredField("name");
            field.setAccessible(true);

            PrivateTest privateTest = new PrivateTest();
            field.set(privateTest,"new value");
            System.out.println("PrivateTest.main "+privateTest.getName());

            /**
             * forName
             *
             * .class
             *
             *
             * getClass
             *
             *
             * 包装类 .TYPE   e.g. Integer.TYPE
             */


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
