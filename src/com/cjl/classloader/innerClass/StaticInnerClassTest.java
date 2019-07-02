package com.cjl.classloader.innerClass;

/**
 * Created by chenjianliang on 2017/5/19.
 * 静态内部类
 */


class StaticInner{
    private static int a = 4;
    public static class Inner{

    }
}
public class StaticInnerClassTest {
    public static void main(String[] args) {
        StaticInner.Inner inner = new StaticInner.Inner();
    }
}
