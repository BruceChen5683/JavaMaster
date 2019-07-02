package com.cjl.io.old;

import java.io.*;

/**
 * Created by chenjianliang on 2017/5/24.
 */
public class SerilableTest {
    public static void main(String[] args) throws Exception{
        Person2 person1 = new Person2(1,"hhhhh",20.2);
        Person2 person2 = new Person2(2,"kkkkk",9.2);
        Person2 person3= new Person2(43,"jjjjj",2.3);

        FileOutputStream fos = new FileOutputStream("test.txt");

        ObjectOutputStream oop = new ObjectOutputStream(fos);

        oop.writeObject(person1);
        oop.writeObject(person2);
        oop.writeObject(person3);

        oop.close();


        FileInputStream fis = new FileInputStream("test.txt");
        ObjectInputStream oip = new ObjectInputStream(fis);

        Person2 person;
        person = (Person2) oip.readObject();

        System.out.println("person1 = " + person);

        person = (Person2) oip.readObject();

        System.out.println("person2 = " + person);
        person = (Person2) oip.readObject();

        System.out.println("person3 = " + person);


        oip.close();







//        int length;
//        while ( (length = oip.read()) != -1){
//            oip.
//        }

//        System.out.println("SerilableTest.main"+oip.readInt());
//        System.out.println("SerilableTest.main"+oip.readLine());
//        System.out.println("SerilableTest.main"+oip.readDouble());








    }
}

class Person implements Serializable{
    int age;
    String name;
    double height;

    public Person(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
}

class Person2 implements Serializable{
    int age;
    String name;
    double height;

    public Person2(int age, String name, double height) {
        this.age = age;
        this.name = name;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", height=" + height +
                '}';
    }
//自己实现序列话，反序列化
    private void writeObject(ObjectOutputStream out) throws IOException{
        out.writeInt(age);
        out.writeUTF(name);
//        out.writeDouble(height);
        System.out.println("Person2.writeObject");
    }


    private void readObject(ObjectInputStream in) throws IOException,ClassNotFoundException{
        age = in.readInt();
        name = in.readUTF();
//        height = in.readDouble();
        System.out.println("Person2.readObject");
    }
}



