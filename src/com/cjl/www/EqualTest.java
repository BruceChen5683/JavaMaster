package com.cjl.www;

public class EqualTest {

    public static void main(String[] args) {
        String str = new String("abc");

        String str2 = new String("abc");

        System.out.println(str == str2);
        System.out.println(str.equals(str2));


        Object object = new Object();
        Object object2 = new Object();

        System.out.println(object == object2);
        System.out.println(object.equals(object2));

        Person person = new Person("cjl");
        Person person1 =new Person("cjl");

        System.out.println(person.equals(person1));



    }
}


class Person{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof Person){
            return (((Person) obj).name.equals(this.name));
        }
        return false;
    }
}
