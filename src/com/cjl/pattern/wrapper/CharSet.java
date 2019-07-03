package com.cjl.pattern.wrapper;

import java.io.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class CharSet {

    public static void main(String[] args) throws  Exception{
//        Properties p = System.getProperties();
//
//        p.list(System.out);

        RandomAccessFile  randomAccessFile = new RandomAccessFile("src/com/cjl/pattern/wrapper/rf.file","rw");


        Person person = new Person(12,"dd",12.0f);

        randomAccessFile.writeInt(person.getId());
        randomAccessFile.writeUTF(person.getName());
        randomAccessFile.writeFloat(person.getF());


        Person person1 = new Person();

        randomAccessFile.seek(0);

        person1.setId(randomAccessFile.readInt());
        person1.setName(randomAccessFile.readUTF());
        person1.setF(randomAccessFile.readFloat());


        System.out.println("CharSet.main ---"+person1);

//        Serializable
//        Externalizable

        SortedMap<String,Charset> map = Charset.availableCharsets();
        System.out.println("CharSet.main*********************");
        Set<String> set = map.keySet();
        for (Iterator iterator = set.iterator();iterator.hasNext();){
            System.out.println("CharSet.main"+iterator.next());
        }


    }
}


class Person{
    int id;
    String name;
    float f;

    public Person() {
    }

    public Person(int id, String name, float f) {
        this.id = id;
        this.name = name;
        this.f = f;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getF() {
        return f;
    }

    public void setF(float f) {
        this.f = f;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", f=" + f +
                '}';
    }
}
