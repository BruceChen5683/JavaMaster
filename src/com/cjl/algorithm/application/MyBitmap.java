package com.cjl.algorithm.application;

//todo 与 或 异或
public class MyBitmap {

    private long[] words;
    private int size;

    public MyBitmap(int size) {
        this.size = size;
        this.words = new long[getWordIndex(size -1 ) +1];
    }

    private int getWordIndex(int bitIndex) {
        return bitIndex >> 6;
    }

    public void setBit(int bitIndex){
        if (bitIndex < 0 || bitIndex > size-1){
            throw new IndexOutOfBoundsException("out of range");
        }
        int wordIndex = getWordIndex(bitIndex);
        words[wordIndex] |= (1L << bitIndex);
    }

    public boolean getBit(int bitIndex){
        if (bitIndex < 0 || bitIndex > size-1){
            throw new IndexOutOfBoundsException("out of range");
        }
        int wordIndex = getWordIndex(bitIndex);
        return (words[wordIndex] & (1L << bitIndex)) != 0;
    }

}
