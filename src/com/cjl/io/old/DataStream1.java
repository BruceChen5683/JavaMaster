package com.cjl.io.old;

import java.io.*;

/**
 * Created by chenjianliang on 2017/5/22.
 */
public class DataStream1 {

    public static void main(String[] args) throws  Exception{
        DataOutputStream dos = new DataOutputStream(
                                    new BufferedOutputStream(
                                        new FileOutputStream("ttt.text")
                                    )
        );

        byte b = 3;
        int i = 12;
        char c = 'a';
        float f = 12.4f;

        dos.writeByte(b);
        dos.writeInt(i);
        dos.writeChar(c);
        dos.writeFloat(f);

        dos.close();




        DataInputStream dis = new DataInputStream(new FileInputStream("ttt.text"));


        System.out.println(dis.readByte());
        System.out.println(dis.readInt());
        System.out.println(dis.readChar());
        System.out.println(dis.readFloat());

        dis.close();




    }
}

