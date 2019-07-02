package com.cjl.io.old;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by chenjianliang on 2017/5/22.
 */
public class BufferedOutputStreamTest1 {
    public static void main(String[] args) throws IOException {

        OutputStream os = new FileOutputStream("none.text");

        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(os);

        bufferedOutputStream.write("llll".getBytes());

        bufferedOutputStream.flush();


//        bufferedOutputStream.close();

    }
}
