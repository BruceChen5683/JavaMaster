package com.cjl.other.defgeneric;

import java.util.ArrayList;

public class Restrict<T> {

    private class Pro<T> extends ArrayList{

    }

//    private class Pro2<T> extends Exception{
//
//    };

    public static void main(String[] args) {
//        Restrict<int> restrict;
        Restrict<Integer> integerRestrict = new Restrict<>();
//        if(integerRestrict instanceof Object){
//
//        }

        Restrict<String> stringRestrict = new Restrict<>();
        if (integerRestrict.getClass() == stringRestrict.getClass()){
            System.out.println("===");
        }
        System.out.printf(integerRestrict.getClass().getName());


        Restrict<Integer>[] restricts = new Restrict[10];
//        Restrict<Double>[] restricts1 = new Restrict<Double>[10];
        for (int i=0;i<10;i++){
            restricts[i] = new Restrict<Integer>();
        }


    }
}
