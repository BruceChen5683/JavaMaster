package com.cjl.interview;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        char[] ch1 = new char[2];
        ch1[0] = 'a';
        ch1[1] = 'b';

        char[] ch2 = new char[2];
        ch2[0] = 'a';
        ch2[1] = 'b';

        System.out.println(ch1.equals(ch2));


        System.out.println(Arrays.toString(ch1).equals(Arrays.toString(ch2)));

    }
}
