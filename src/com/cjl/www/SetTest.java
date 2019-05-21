package com.cjl.www;

import java.util.HashMap;
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


/**
 * HashSet 底层有HashMap实现
 *
 * 这个HashMap中的key就是HashSet中的对象，value是一个Object类型对象
 *
 * 当调用 HashSet add方法时，实际是向hashMap中增加一行(key-value对)，该行的key就是向Hastset增加的那个对象，该行的value就是一个Object类型的常量
 *
 *
 *
 * HashMap 底层通过数组维护
 *
 * 调用增加的那个对象的hashcode方法，来得到一个hashCode值，然后根据该值来计算出一个数组的下标索引（计算出数组中的一个位置）
 *
 * 将准备增加到map中的对象与该位置上的对象进行比较（equals方法），若相同，那么将该位置上的那个对象（Entry类型）的value值替换掉，否则沿着Entry的链继续重复上述过程
 * 若到链最后仍然没有找到与此对象相同的对象，那么将该对象增加到数组中。将数组中该位置上的那个Entry对象链到该对象的后面
 *
 * 对于hashSet、hashmap来说，这样做就是为了提高查找效率，使得查找时间不随着set或者map的大小改变
 *
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
        System.out.println("SetTest.main--------put null");
        HashMap hashMap = new HashMap();

        System.out.println("SetTest.main "+hashMap.put(null,"3"));
        System.out.println("SetTest.main "+hashMap.put(null,"4"));

        System.out.println("SetTest.main "+hashMap);
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
