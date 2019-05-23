package com.cjl.algorithm;

public class Test {
    public static void main(String[] args) {

        Integer a = 10;Integer b = 13;


        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("Test.main "+ a);
        System.out.println("Test.main "+b);



        MySort mySort = new BubbleSort();
        mySort.myprint(mySort.sort(new int[]{99,1,1,2,5,2,3,32,3, 4, 1, 5, 2, 1}));
    }



}
