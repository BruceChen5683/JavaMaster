package com.cjl.algorithm.application;

import java.util.Arrays;
import java.util.Objects;

public class BaseTag {
    protected long[] words;
    protected int size;

    public BaseTag(int size) {
        this.size = size;
        this.words = new long[getWordIndex(size -1 ) +1];
    }

    private int getWordIndex(int bitIndex) {
        return bitIndex >> 6; //long 64=2^6
    }

    public void setBit(int bitIndex){

        if (bitIndex < 0 || bitIndex > size-1){
            throw new IndexOutOfBoundsException("out of range");
        }
        int wordIndex = getWordIndex(bitIndex);


        words[wordIndex] |= (1L << bitIndex);

        System.out.println("BaseTag.setBit  "+Long.toBinaryString(words[wordIndex]));
    }

    public boolean getBit(int bitIndex){
        if (bitIndex < 0 || bitIndex > size-1){
            throw new IndexOutOfBoundsException("out of range");
        }
        int wordIndex = getWordIndex(bitIndex);
        return (words[wordIndex] & (1L << bitIndex)) != 0;
    }



    // &
    public long[] and(BaseTag baseTag){
        long[] result = new long[getWordIndex(size -1 ) +1];
        for (int i = 0; i < words.length; i++) {
            result[i] = words[i] & baseTag.words[i];

            String str = Long.toBinaryString(result[i]);
            
            System.out.println("BaseTag.and  "+Long.toBinaryString(result[i]));

        }
        return result;
    }

    // |
    public long[] or(BaseTag baseTag){
        long[] result = new long[getWordIndex(size -1 ) +1];
        return result;
    }


    // xor
    public long[] xor(BaseTag baseTag){
        long[] result = new long[getWordIndex(size -1 ) +1];
        return result;
    }
}

