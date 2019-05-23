package com.cjl.algorithm;

public abstract class MySortExt implements MySort {

    public abstract int[] sort(int[] array);

    public void myprint(int[] array){
        System.out.print("MySortExt.myprint "+this.getClass().getSimpleName() +"  [");
        for (int i = 0; i < array.length ; i++){
            System.out.print(array[i]);

            if (i !=  array.length -1){
                System.out.print(",");
            }
        }
        System.out.println("]");
    }

}
