package com.cjl.jvm.classloader;

/**
 * 对于静态字段来说，只有直接定义了该字段的类才会被初始化
 *
 * 当一个类在初始化时，要求对其父类全部都已经初始化完毕了
 *
 *
 * -XX:+TraceClassLoading,用于追踪类的加载信息并打印
 *
 * JVM参数三种情况
 * -XX:+<option>   表示开启option选项
 * -XX:-<option>   表示关闭option选项
 * -XX:<option>=<value>   表示将option选项的值设置为value
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(B1.str);
    }
}

class A1{
    public static String str = "hello world";

    static {
        System.out.println("A1.static initializer");
    }
}

class B1 extends A1{

    public static String str2 = "child ---";

    static {
        System.out.println("B1.static initializer");
    }
}
//初始化顺序
//    public static void main(String[] args) {
//        System.out.println(B1.str);
//    }
//
//        [Loaded com.cjl.jvm.classloader.MyTest1 from file:/I:/personal_pro/JavaMaster/out/]
//        ...
//        [Loaded com.cjl.jvm.classloader.A1 from file:/I:/personal_pro/JavaMaster/out/]  *****
//        [Loaded com.cjl.jvm.classloader.B1 from file:/I:/personal_pro/JavaMaster/out/]  *****虽然未初始化child,但是加载了child
//        A1.static initializer
//        hello world

//--------------------------------------------------------------------------------------------

//    public static void main(String[] args) {
//        System.out.println(B1.str2);
//    }

//        A1.static initializer
//        B1.static initializer
//        child ---









