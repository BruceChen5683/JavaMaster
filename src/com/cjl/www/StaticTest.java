package com.cjl.www;

public class StaticTest {

    private static StaticTest staticTest = new StaticTest();

    public static int count1;
    public static int count2 = 0;

    private StaticTest(){
        count1++;
        count2++;
    }

    public static StaticTest getInstance(){
        return staticTest;
    }

    public static void main(String[] args) {
        StaticTest staticTest = StaticTest.getInstance();

        System.out.println("count1   "+staticTest.count1);
        System.out.println("count2   "+staticTest.count2);

        /**
         * 1. staticTest = new StaticTest()
         * 2. 构造  count1++,count2++
         * 3. count1声明跳过，count2赋值0
         */

    }
}
