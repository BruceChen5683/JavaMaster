package com.cjl.aspectj;

public class HiMan3 {

    public static void main(String[] args) {
//        System.out.println("hi Man");
        main(5);
    }

    public static int main(int i){
        System.out.println("in the main method i = "+i);
        return i;
    }
}
