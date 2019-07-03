package com.cjl.pattern.wrapper;

import java.io.*;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class StreamTest {

    public static void main(String[] args) throws  Exception{
        FileOutputStream fos = new FileOutputStream("/Users/chenjianliang/Documents/file.text");

        OutputStreamWriter osw = new OutputStreamWriter(fos);


        BufferedWriter bw = new BufferedWriter(osw);

        bw.write("www.baidu.com");
        bw.write("hi,girls");

        bw.close();


        FileInputStream fis = new FileInputStream("/Users/chenjianliang/Documents/file.text");
        InputStreamReader isr = new InputStreamReader(fis);

//        char[] c = new char[1024];
//        while (-1 != isr.read()){
//            isr.read(c);
//        }
//
//        System.out.println("StreamTest.main----"+c);


        BufferedReader br = new BufferedReader(isr);


        System.out.println("StreamTest.main"+br.readLine());
        System.out.println("StreamTest.main"+br.readLine());
        System.out.println("StreamTest.main"+br.readLine());

        br.close();








    }
}
