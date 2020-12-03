package com.cjl.aspectj;

public class AfterMan {
    public String getName(){
        return "Jack";
    }

    public static void main(String[] args){
        System.out.println("...main...");
        new AfterMan().getName();
    }
}
