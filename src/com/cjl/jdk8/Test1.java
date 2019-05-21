package com.cjl.jdk8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);

//        for (int i = 0; i < list.size();i++){
//            System.out.println("Test1.main i "+list.get(i));
//        }
//        System.out.println("Test1.main ------------------");
//
//        for (Integer i:list){
//            System.out.println("Test1.main i "+i);
//        }
//
//        System.out.println("Test1.main ------------------");
        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) {
                System.out.println("Test1.accept "+integer);
            }
        }.andThen(integer -> {
            System.out.println("Test1.main integer andThen "+integer);
        }));

//        FunctionalInterface 函数式接口
        list.forEach(integer -> System.out.println("Test1.main integer "+integer));

        System.out.println("Test1.mainXXXXXXXXXXXXXX");
        //method reference
        list.forEach(System.out::println);


    }
}
