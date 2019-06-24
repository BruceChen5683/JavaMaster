package com.cjl.jvm.classloader;

/**
 * 对于数组实例，其类型是有JVM在运行期动态生成的。表示为[Lcom.cjl.jvm.classloader.MyParent4这种形式
 *
 * 动态生成的类型，其父类型是Object类
 *
 * 对于数组来说，JavaDoc经常将构成数组的元素为Component，实际上就是将数组降低一个维度后的类型
 *
 * 助记符  anewarray  创建引用类（接口、类、数组）的数组，并将其引用值压入栈顶
 *         multianewarray   创建多维引用类型的数组
 *         newarray   创建一个指定的原始类型（int、float、char等 ）的数组，并将其引用值压入栈顶
 *
 */
public class MyTest4 {

    public static void main(String[] args) {
//        MyParent4 myParent4 = new MyParent4();

        MyParent4[] parent4s = new MyParent4[4];

        System.out.println("MyTest4.main "+parent4s.getClass());

        System.out.println("MyTest4.main "+new MyParent4[4][4].getClass());


        System.out.println("MyTest4.main  "+new MyParent4[1][1].getClass().getSuperclass());


        //MyTest4.main  class [I
        System.out.println("MyTest4.main  "+new int[1].getClass());
        //MyTest4.main   class [D
        System.out.println("MyTest4.main   "+new double[22].getClass());
        System.out.println("MyTest4.main   "+new double[22][12].getClass());

    }
}

class MyParent4{

    static {
        System.out.println("MyParent4.static initializer");
    }
}

//MyTest4.main class [Lcom.cjl.jvm.classloader.MyParent4;
//MyTest4.main class [[Lcom.cjl.jvm.classloader.MyParent4;
//MyTest4.main  class java.lang.Object


//javap -c xxx.class
//
//
//I:\personal_pro\JavaMaster\out\com\cjl\jvm\classloader>javap -c MyTest4.class
//Compiled from "MyTest4.java"
//public class com.cjl.jvm.classloader.MyTest4 {
//public com.cjl.jvm.classloader.MyTest4();
//        Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//
//public static void main(java.lang.String[]);
//        Code:
//        0: iconst_4
//        1: anewarray     #2                  // class com/cjl/jvm/classloader/MyParent4
//        4: astore_1
//        5: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        8: new           #4                  // class java/lang/StringBuilder
//        11: dup
//        12: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
//        15: ldc           #6                  // String MyTest4.main
//        17: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        20: aload_1
//        21: invokevirtual #8                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
//        24: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
//        27: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        30: invokevirtual #11                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        33: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        36: new           #4                  // class java/lang/StringBuilder
//        39: dup
//        40: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
//        43: ldc           #6                  // String MyTest4.main
//        45: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        48: iconst_4
//        49: iconst_4
//        50: multianewarray #12,  2            // class "[[Lcom/cjl/jvm/classloader/MyParent4;"
//        54: invokevirtual #8                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
//        57: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
//        60: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        63: invokevirtual #11                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        66: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        69: new           #4                  // class java/lang/StringBuilder
//        72: dup
//        73: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
//        76: ldc           #13                 // String MyTest4.main
//        78: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        81: iconst_1
//        82: iconst_1
//        83: multianewarray #12,  2            // class "[[Lcom/cjl/jvm/classloader/MyParent4;"
//        87: invokevirtual #8                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
//        90: invokevirtual #14                 // Method java/lang/Class.getSuperclass:()Ljava/lang/Class;
//        93: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
//        96: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        99: invokevirtual #11                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        102: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        105: new           #4                  // class java/lang/StringBuilder
//        108: dup
//        109: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
//        112: ldc           #13                 // String MyTest4.main
//        114: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        117: iconst_1
//        118: newarray       int
//        120: invokevirtual #8                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
//        123: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
//        126: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        129: invokevirtual #11                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        132: getstatic     #3                  // Field java/lang/System.out:Ljava/io/PrintStream;
//        135: new           #4                  // class java/lang/StringBuilder
//        138: dup
//        139: invokespecial #5                  // Method java/lang/StringBuilder."<init>":()V
//        142: ldc           #15                 // String MyTest4.main
//        144: invokevirtual #7                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
//        147: bipush        22
//        149: newarray       double
//        151: invokevirtual #8                  // Method java/lang/Object.getClass:()Ljava/lang/Class;
//        154: invokevirtual #9                  // Method java/lang/StringBuilder.append:(Ljava/lang/Object;)Ljava/lang/StringBuilder;
//        157: invokevirtual #10                 // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
//        160: invokevirtual #11                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
//        163: return
//        }

