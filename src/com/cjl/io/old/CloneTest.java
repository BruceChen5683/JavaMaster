package com.cjl.io.old;

/**
 * Created by chenjianliang on 2017/5/28.
 * 深复制，浅复制
 */
public class CloneTest {
    public static void main(String[] args) {
        System.out.println("**********浅复制*****************");

        ShallowStudent student1 = new ShallowStudent();
        Teacher teacher = new Teacher();
        teacher.setAge(55);
        teacher.setName("teacher Li");
        student1.setAge(10);
        student1.setName("student");
        student1.setTeacher(teacher);

        ShallowStudent student2 = null;
        try {
            student2 = (ShallowStudent) student1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(student2.getAge());
        System.out.println(student2.getName());
        teacher.setName("改名了 ");
        System.out.println(student2.getTeacher().getAge());
        System.out.println(student2.getTeacher().getName());


        System.out.println("************深复制***************");


        DeepStudent student3 = new DeepStudent();
        Teacher teacher2 = new Teacher();
        teacher2.setAge(55);
        teacher2.setName("teacher Li");
        student3.setAge(10);
        student3.setName("student");
        student3.setTeacher(teacher2);

        DeepStudent student4 = null;
        try {
            student4 = (DeepStudent) student3.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(student4.getAge());
        System.out.println(student4.getName());
        teacher2.setName("改名了 无效");
        System.out.println(student4.getTeacher().getAge());
        System.out.println(student4.getTeacher().getName());




    }
}


class  ShallowStudent implements Cloneable{
    private int age;
    private String name;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
//        return super.clone();
    }
}


class DeepStudent implements Cloneable{
    private int age;
    private String name;
    private Teacher teacher;

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

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

    @Override
    public Object clone() throws CloneNotSupportedException {
        DeepStudent student = (DeepStudent)super.clone();

        student.setTeacher((Teacher) student.getTeacher().clone());
        return student;
//        return super.clone();
    }
}

class Teacher implements Cloneable{
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

    @Override
    public Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();
        return obj;
    }
}


