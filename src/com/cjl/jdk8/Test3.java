package com.cjl.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Test3 {
    public static void main(String[] args) {
        TheInterface theInterface1 = (a)->{};
        System.out.println("Test3.main "+theInterface1.getClass().getInterfaces()[0]);

        TheInterface2 theInterface2 = ()->{};
        System.out.println("Test3.main "+theInterface2.getClass().getInterfaces()[0]);


        new Thread( ()->{
            System.out.println("Test3.main thread ");
        }).start();

        Arrays.asList("","","");
        List<String> list = new ArrayList<>();
        list.add("dsfa");
        list.add("fsdfa");
        list.add("xdsfa");
        list.add("ndsfa");
        list.add("dsfa");

        List<String> list2 = new ArrayList<>();

        //lambda
        list.forEach(s-> list2.add(s.toUpperCase()));
        list2.forEach(s-> System.out.println("Test3.main "+s));

        //Stream

        //stram()
        //parallelStream
        list.stream().map(item -> item.toUpperCase()).forEach(item-> System.out.println("Test3.main item:"+item));

        //double colon
        list.stream().map(String::toUpperCase).forEach(item-> System.out.println("Test3.main item->"+item));


        Function<String,String> function = String::toUpperCase;
        System.out.println("Test3.main "+function.getClass().getInterfaces()[0]);


    }
}

@FunctionalInterface
interface TheInterface{
    void test(int a);
}

@FunctionalInterface
interface TheInterface2{
    void test2();
}
