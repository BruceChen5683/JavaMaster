package com.cjl.io.old;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by chenjianliang on 2017/5/21.
 */
public class InputStreamTest1 {

    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream =
                new FileInputStream("README.md");
        byte[] buffer = new byte[1024];
        int legth = 0;
        int a = 1;
        int b = 3;
        int sum =0;

        sum = a-b;
        sum = a+b;
        String str;
        while(-1 != (legth = fileInputStream.read(buffer,0,1024))){
            str = new String(buffer,0,legth);
            System.out.println("InputStreamTest1.main..."+str);
        }

        fileInputStream.close();

//        DataInputStream
//        BufferedInputStream

    }
}
