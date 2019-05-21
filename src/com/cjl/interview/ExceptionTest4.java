package com.cjl.interview;

import java.io.IOException;

public class ExceptionTest4 {

    public void doSth() throws IOException{
        System.out.println("ExceptionTest4.doSth");
    }

    public static void main(String[] args) {
        ExceptionTest4 test4 = new ExceptionTest4();
        try {
            test4.doSth();
        }/*catch (Exception e){

        } */catch (IOException e) {
            e.printStackTrace();
        }
    }
}
