package com.cjl.annotation;

@AnnotationTest(value = "hi,man",name = "cjl",enumt = EnumTest.WELCOME)
public class AnnotationUsage {
    public void method(){
        System.out.println("AnnotationUsage.method");
    }

    public static void main(String[] args) {
        AnnotationUsage annotationUsage = new AnnotationUsage();

        System.out.println("AnnotationUsage.main xx"+annotationUsage.getClass().isAnnotationPresent(AnnotationTest.class));

        annotationUsage.method();
    }

    //TODO https://www.cnblogs.com/djie/p/4998428.html
}
