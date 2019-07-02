package com.cjl.annotation;

public @interface AnnotationTest {
    String value();
    String name();
    int hh() default 10;
    EnumTest enumt() default EnumTest.HELLO;
}

enum EnumTest{
    HELLO,WORLD,WELCOME;
}
