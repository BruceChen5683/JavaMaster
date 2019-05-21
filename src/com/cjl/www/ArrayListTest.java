package com.cjl.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ArrayListTest {
    public static void main(String[] args) {

        int count = 1000000;
        List list = new ArrayList();

        Vector vector = new Vector();

        List list2 = new LinkedList();

        long now = System.currentTimeMillis();
        for(int i=0 ; i < count;i++){
            list.add(Integer.valueOf(i));
        }
        System.out.println("ArrayList end "+ (System.currentTimeMillis()-now));

        now = System.currentTimeMillis();
        for(int i=0 ; i < count;i++){
            vector.add(Integer.valueOf(i));
        }
        System.out.println("Vector end "+ (System.currentTimeMillis()-now));

        now = System.currentTimeMillis();
        for(int i=0 ; i < count;i++){
            list2.add(Integer.valueOf(i));
        }
        System.out.println("LinkedList end "+ (System.currentTimeMillis()-now));



        now = System.currentTimeMillis();
        while (list.size() > 0){
            list.remove(0);
        }
        System.out.println("ArrayList remove "+ (System.currentTimeMillis()-now));

        now = System.currentTimeMillis();
        while (vector.size() > 0){
            vector.remove(0);
        }
        System.out.println("Vector remove "+ (System.currentTimeMillis()-now));

        now = System.currentTimeMillis();
        while (list2.size() > 0){
            list2.remove(0);
        }
        System.out.println("LinkedList remove "+ (System.currentTimeMillis()-now));




    }
}
//        count设为1000000

//        ArrayList end 25
//        Vector end 37
//        LinkedList end 59
//        ArrayList remove 63743
//        Vector remove 64442
//        LinkedList remove 13
