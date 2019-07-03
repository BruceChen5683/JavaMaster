package com.cjl.pattern.wrapper;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class StreamTest2 {

    public static void main(String[] args) throws Exception{
//        InputStreamReader isr = new InputStreamReader(System.in);
//
//        BufferedReader br = new BufferedReader(isr);
//
//        String str;
//        while ((str = br.readLine()) != null){
//            System.out.println("StreamTest2.main"+ str);
//        }
//
//        br.close();


        FileReader fr = new FileReader("src/com/cjl/pattern/wrapper/StreamTest.java");
        BufferedReader br = new BufferedReader(fr);
        String str;
        while ((str = br.readLine()) != null){
            System.out.println("StreamTest2.main  " + str);
        }
    }
}
