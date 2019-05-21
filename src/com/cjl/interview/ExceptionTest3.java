package com.cjl.interview;

public class ExceptionTest3 {

    /**
     *  checked exception
     *
     *  unchecked exception 可不处理  RuntimeException
     */
    public void doSth() throws ArithmeticException{
        System.out.println("ExceptionTest3.doSth");
    }

    public static void main(String[] args) {
        ExceptionTest3 test3 = new ExceptionTest3();
        test3.doSth();
    }
}
