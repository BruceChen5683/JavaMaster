package com.cjl.jvm.classloader;

/**
 * 常量在编译阶段会被存入到调用这个常量的方法所在的类的常量池中，
 * 本质上，调用类并没有直接引用定义常量的类，因此并不会触发
 * 定义常量的类的初始化
 *
 * 注意：这里指的是将常量存放在MyTest2的常量池中，之后MyTest2与A2就没有任何关联了
 * 甚至，我们可以将A2的class文件删除
 *
 *
 * 助记符：
 * ldc  表示将int,float或者String类型的常量值从常量池中推送至栈顶
 * bipush 表示将当字节（-128 - 127）的常量值从常量池中推送至栈顶
 * sipush 表示将一个短整数型常量值（-32768 - 32767）推送至栈顶
 * iconst_1表示将int类型1推送至栈顶(iconst_0 - iconst_5)
 */
public class MyTest2 {

    public static void main(String[] args) {
        System.out.println(A2.str);
        System.out.println(A2.s);
        System.out.println(A2.s2);
        System.out.println(A2.f);
        System.out.println(A2.i);

    }
}


class A2{
    public static final String str = "hi jack";
    public static final short s = 127;
    public static final short s2 = 128;
    public static final float f = 1.0f;
    public static final int i = 0;

    static {
        System.out.println("A2.static initializer");
    }
}


//
//I:\personal_pro\JavaMaster\out\com\cjl\jvm\classloader>javap -c MyTest2.class
//Compiled from "MyTest2.java"
//public class com.cjl.jvm.classloader.MyTest2 {
//public com.cjl.jvm.classloader.MyTest2();
//        Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//
//public static void main(java.lang.String[]);
//        Code:
//        0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        3: ldc           #4                  // String hi jack                                    <<<<<---------------
//        5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        8: return
//        }





//0: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//3: ldc           #4                  // String hi jack
//5: invokevirtual #5                  // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//8: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//11: bipush        127
//13: invokevirtual #6                  // Method java/io/PrintStream.println:(I)V
//16: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//19: sipush        128
//22: invokevirtual #6                  // Method java/io/PrintStream.println:(I)V
//25: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//28: fconst_1
//29: invokevirtual #7                  // Method java/io/PrintStream.println:(F)V
//32: getstatic     #2                  // Field java/lang/System.out:Ljava/io/PrintStream;
//35: iconst_0
//36: invokevirtual #6                  // Method java/io/PrintStream.println:(I)V
