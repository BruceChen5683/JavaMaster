package com.cjl.algorithm.simple;


import com.cjl.algorithm.base.MySortExt;

public class SelectionSort extends MySortExt {
    @Override
    public int[] sort(int[] array) {
        if (array.length <= 1){
            return array;
        }

        for (int i = 0;i < array.length;i++){
            int temp = i;
            int min = array[temp];
            int j = i;
            for (;j < array.length;j++){
                if (min > array[j]){
                    min = array[j] ;
                    temp = j;
                }
            }
            array[temp] = array[i];
            array[i] = min;
        }

        return array;
    }
}
