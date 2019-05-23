package com.cjl.algorithm.simple;

import com.cjl.algorithm.base.MySortExt;

public class InsertionSort extends MySortExt {


    @Override
    public int[] sort(int[] array) {
        if (array.length <= 1){
            return array;
        }

        for (int i=0; i < array.length;i++){
            for (int j = i+1;j > 0 && j < array.length;j--){
                if (array[j] < array[j-1]){
                    array[j] = array[j] + array[j-1];
                    array[j-1] = array[j] - array[j-1];
                    array[j] = array[j] - array[j-1];
                }
            }
        }

        return array;
    }
}
