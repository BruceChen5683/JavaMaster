package com.cjl.jdk8;

import java.util.function.Predicate;

public class PredicateTest {


    public static void main(String[] args) {

        Predicate<String> predicate = s->s.equals("s");

        System.out.println(predicate.test("s"));
        System.out.println(predicate.test("h"));

    }
}
