package com.cjl.io.serializable;

import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.*;

public class Course1 implements Externalizable {

    private static final long serialVersionUID = 667279791530738499L;
    private String name;
    private float score;

    public Course1() {
        System.out.println("Course: empty");
    }

    public Course1(String name, float score) {
        System.out.println("Course: " + name + " " + score);
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public void writeExternal(ObjectOutput objectOutput) throws IOException {
        System.out.println("writeExternal");
        objectOutput.writeObject(name);
        objectOutput.writeFloat(score);
    }

    @Override
    public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
        System.out.println("readExternal");
        name = (String)objectInput.readObject();
        score = objectInput.readFloat();
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    public static void main(String... args) throws Exception {
        //TODO:
        Course1 course = new Course1("英语", 12f);


        ByteArrayOutputStream out = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(course);
        byte[] bs = out.toByteArray();
        oos.close();
        System.out.println("============反序列化=============");
        ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(bs));
        Course1 course1 = (Course1) ois.readObject();
        System.out.println("course1: " + course1);

    }


}
