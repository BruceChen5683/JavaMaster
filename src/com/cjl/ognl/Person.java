package com.cjl.ognl;

/**
 * Created by chenjianliang on 2018/6/1.
 */
public class Person {
    private String name;
    private Dog dog;


    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        System.out.println("Person.getName");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        System.out.println("Person.toString");
//        return name;
        return super.toString();
    }
}
