package com.cjl.io.old;


import java.io.*;

/**
 * Created by chenjianliang on 2017/5/29.
 */
public class CloneTest2 {

    public static void main(String[] args) {
        Student2 student2 = new Student2();
        student2.setAge(10);
        student2.setName("stu");
        Teacher2 teacher2 = new Teacher2();
        teacher2.setAge(44);
        teacher2.setName("te");
        student2.setTeacher2(teacher2);

        try {
        Student2 student21 =  (Student2) student2.deepCopy();
        teacher2.setName("ffsf");
        student2.setTeacher2(teacher2);
            System.out.println(        student21.getTeacher2().getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Student2 implements Serializable{

    private int age;
    private String name;
    private Teacher2 teacher2;


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher2 getTeacher2() {
        return teacher2;
    }

    public void setTeacher2(Teacher2 teacher2) {
        this.teacher2 = teacher2;
    }

    public Object deepCopy() throws Exception {

        ByteArrayOutputStream bos = new ByteArrayOutputStream();
//      ByteOutputStream bos = new ByteOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
//        ByteInputStream bis = new ByteInputStream(bos.toByteArray(),bos.toByteArray().length);
        ObjectInputStream ois = new ObjectInputStream(bis);

        oos.close();
        ois.close();

        return ois.readObject();

//
//        FileOutputStream fos = new FileOutputStream("/Users/chenjianliang/IdeaProjects/TestDemo/temp.file");
//
//        ObjectOutputStream oos = new ObjectOutputStream(fos);
//
//        oos.writeObject(student2);
//
//        oos.close();
//
//
//        FileInputStream fis = new FileInputStream("/Users/chenjianliang/IdeaProjects/TestDemo/temp.file");
//        ObjectInputStream ois = new ObjectInputStream(fis);
//        student2 = (Student2)ois.readObject();
//        System.out.println(student2.getName());
//        System.out.println(student2.getAge());
//        System.out.println(student2.getTeacher2().getAge());
//        System.out.println(student2.getTeacher2().getName());
//
//        ois.close();


//        return student3;
    }

}


class Teacher2 implements Serializable{
    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
