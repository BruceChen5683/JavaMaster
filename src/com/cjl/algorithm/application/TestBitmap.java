package com.cjl.algorithm.application;

public class TestBitmap {

    public static void main(String[] args) {
        int size = 128;
        TAG1 tag1 = new TAG1(size);
        TAG2 tag2 = new TAG2(size);
        TAG3 tag3 = new TAG3(size);
        TAG4 tag4 = new TAG4(size);


        tag1.setBit(1);
        tag1.setBit(2);
        tag1.setBit(4);
        tag1.setBit(6);
        tag1.setBit(10);
        tag1.setBit(33);

        tag2.setBit(1);
        tag2.setBit(2);
        tag2.setBit(3);
        tag2.setBit(4);
        tag2.setBit(5);
        tag2.setBit(7);
        tag2.setBit(10);

        tag3.setBit(1);
        tag3.setBit(3);
        tag3.setBit(5);
        tag3.setBit(8);
        tag3.setBit(10);

        tag4.setBit(1);
        tag4.setBit(3);
        tag4.setBit(9);
        tag4.setBit(10);
        tag4.setBit(33);


        tag1.and(tag4);




    }
}


