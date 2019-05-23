package com.cjl.algorithm.simple;

import com.cjl.algorithm.base.MySortExt;

public class BubbleSort extends MySortExt {

    @Override
    public int[] sort(int[] array) {

        if (array.length <= 1){
            return array;
        }

        for (int j = 0; j < array.length-1;j++){
            for (int i = 0; i < array.length-j && (i+1 < array.length);i++){
                if (array[i] > array[i+1]){
                    array[i] = array[i] + array[i+1];
                    array[i+1] = array[i] -array[i+1];
                    array[i] = array[i] - array[i+1];
                }
            }
        }

        return array;
    }
}
