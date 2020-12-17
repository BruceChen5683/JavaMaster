package com.cjl.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)
public @interface AnnotationTest {
    String value();
    String name();
    int hh() default 10;
    EnumTest enumt() default EnumTest.HELLO;
}

enum EnumTest{
    HELLO,WORLD,WELCOME;
}
