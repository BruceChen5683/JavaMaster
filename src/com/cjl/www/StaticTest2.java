package com.cjl.www;

public class StaticTest2 {


    public static int count1;
    public static int count2 = 0;

    private static StaticTest2 staticTest = new StaticTest2();


    private StaticTest2(){
        count1++;
        count2++;
    }

    public static StaticTest2 getInstance(){
        return staticTest;
    }

    public static void main(String[] args) {
        StaticTest2 staticTest = StaticTest2.getInstance();

        System.out.println("count1   "+staticTest.count1);
        System.out.println("count2   "+staticTest.count2);

    }
}
