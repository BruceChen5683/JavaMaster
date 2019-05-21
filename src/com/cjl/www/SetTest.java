package com.cjl.www;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 　　当向集合set中增加对象时，手机集合计算要增加对象的hascode码，根据该值得到一个位置用来存放当前的对象
 * 　　　　 如果在该位置没有一个对象存在的话，那么集合set认为该对象在集合中不存在，直接增加进去
 *  　　　　如果在该位置有一个对象存在的话，接着将准备增加到集合中的对象与该位置上的对象进行equals方法比较，
 *　　　　　　　　　若equals方法返回false,那么集合认为不存在该对象,再进行一次散列，将该对象放到散列后计算出的新地址里
 * 　　　　　　　　 若equals方法返回true,那么集合认为已经存在该对象，不会将该对象增加到集合中
 */
public class SetTest {

    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        System.out.println(set.add("abc"));
        set.add("xyz");
        System.out.println(set.add("abc"));


        for (Iterator<String> iterator = set.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }


        System.out.println("SetTest.main---people");

        Set<People> peopleSet = new HashSet<People>();
        peopleSet.add(new People("cjl"));
        peopleSet.add(new People("cjl"));
        peopleSet.add(new People("hy"));



        for (Iterator<People> iterator = peopleSet.iterator();iterator.hasNext();){
            System.out.println(iterator.next());
        }


        System.out.println("-------------hashCode----------------");
        Object object3 = new Object();
        System.out.println("EqualTest.main hashCode "+object3.hashCode());
        System.out.println("hexString : "+Integer.toHexString(object3.hashCode()));
        System.out.println("object3  "+object3);
    }
}

class People{
    private String name;

    public People(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof People){
            return (((People) obj).name.equals(this.name));
        }
        return false;
    }


    @Override
    public int hashCode() {
//        return super.hashCode();
        return this.name.hashCode();
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                '}';
    }
}
