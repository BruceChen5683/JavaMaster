package com.cjl.jdk8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonFunctionTest {
    public static void main(String[] args) {
        Person person1 = new Person("cjl","12");
        Person person2 = new Person("hy","13");
        Person person3 = new Person("test","14");
        Person person4 = new Person("cjl","3");


        List<Person>  personList = Arrays.asList(person1,person2,person3,person4);

        BiFunction<String,List<Person>,List<Person>> function = (name, lists)-> {
            List<Person> lists2 = new ArrayList<>();
            lists.forEach(person -> {
                if (person.getName().equals(name)){
                    lists2.add(person);
                }
            });
            return lists2;
        };


        function.apply("cjl",personList).forEach(person -> System.out.println("PersonFunctionTest.main "+person));

        getPersonByName("test",personList).forEach(person -> System.out.println("PersonFunctionTest.main "+person));


        Predicate predicate = a->a.equals(1);

        System.out.println("PersonFunctionTest.main "+predicate.test(1));
        System.out.println("PersonFunctionTest.main "+predicate.test(2));


        getPersonByAge(13,personList,(age,persons)->{
           return persons.stream().filter(person -> Integer.valueOf(person.getAge()).intValue() >= age).collect(Collectors.toList());
        }).forEach(person -> System.out.println(person));

        //行为传递

        System.out.println("----");

        getPersonByAge(13,personList,(age,persons)->{
            return persons.stream().filter(person -> Integer.valueOf(person.getAge()).intValue() < age).collect(Collectors.toList());
        }).forEach(person -> System.out.println(person));




    }

    public static List<Person> getPersonByName(String name, List<Person> lists){
        return lists.stream().filter(person -> person.getName().equals(name)).collect(Collectors.toList());
    }

    public static List<Person> getPersonByAge(int age,List<Person> lists,BiFunction<Integer,List<Person>,List<Person>> biFunction){
        return biFunction.apply(age,lists);
    }

}
