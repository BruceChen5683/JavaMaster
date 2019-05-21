package com.cjl.www;

public class OpTest {

    public static void main(String[] args) {
        int a = 3;
        int b = 5;

//        int c = a & b;  按位与
//        System.out.println("OpTest.main "+c);


        int d = 1;
        int e = 2;

        if ( (d == 2) && ((e = 3)==5) ){
            System.out.println("OpTest.main exception");
        }
        System.out.println("&&");
        System.out.println("OpTest.main d "+d);
        System.out.println("OpTest.main e "+e);


        if ( (d == 2) & ((e = 3)==5) ){
            System.out.println("OpTest.main exception");
        }
        System.out.println("&");
        System.out.println("OpTest.main d "+d);
        System.out.println("OpTest.main e "+e);
    }
}
