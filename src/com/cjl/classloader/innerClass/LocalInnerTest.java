package com.cjl.classloader.innerClass;

/**
 * Created by chenjianliang on 2017/5/19.
 */
class LocalIner{

    final int a = 10;
    static int c = 120;
    public void doSth(){
        int b = 111;
        class Inner3{
            public void test(){
                System.out.println("hi,...." + b  + "   " +  a + "  "+c);
            }
        }

        new Inner3().test();
    }
}

public class LocalInnerTest {
    public static void main(String[] args) {
        LocalIner localIner = new LocalIner();
        localIner.doSth();
    }
}
