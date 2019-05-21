package com.cjl.interview;

import java.util.Date;

public class DateTest {

    @SuppressWarnings("deprecation")
    public String get(Date date){
        return date.toLocaleString();
    }

    public static void main(String[] args) {
        DateTest test  = new DateTest();
        System.out.println(test.get(new Date(){
//            @Override
//            public String toLocaleString() {
//                return "hello word";
//            }
        }));

    }

}
