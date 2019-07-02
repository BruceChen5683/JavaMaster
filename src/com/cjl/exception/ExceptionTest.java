package com.cjl.exception;

import java.awt.*;

/**
 * Created by chenjianliang on 2017/5/16.
 */
public class ExceptionTest {
//    Throwable
//    Error
//    Exception
//    ClassCastException
//    ClassNotFoundException
//    IndexOutOfBoundsException
//    OutOfMemoryError
//    NullPointerException

    public void set() throws Exception{
        throw  new MyException("哈哈");
    }

    public static void main(String[] args) throws Exception{

        ExceptionTest exceptionTest = new ExceptionTest();
        try {
            exceptionTest.set();

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("ddddd");
        }
    }

}
