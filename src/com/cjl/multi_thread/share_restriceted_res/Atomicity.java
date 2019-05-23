package com.cjl.multi_thread.share_restriceted_res;

public class Atomicity {
    int i;

    synchronized void f1(){
        i++;
    }

    synchronized void f2(){
        i+=3;
    }
}
//C++  递增可能是原子性操作，可以作为一条微处理器指令来实现

//public class share_restriceted_res.Atomicity {
//        int i;
//
//public share_restriceted_res.Atomicity();
//        Code:
//        0: aload_0
//        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
//        4: return
//
//        void f1();
//        Code:
//        0: aload_0
//        1: dup
//        2: getfield      #2                  // Field i:I
//        5: iconst_1
//        6: iadd
//        7: putfield      #2                  // Field i:I
//        10: return
//
//        void f2();
//        Code:
//        0: aload_0
//        1: dup
//        2: getfield      #2                  // Field i:I
//        5: iconst_3
//        6: iadd
//        7: putfield      #2                  // Field i:I
//        10: return
//        }

