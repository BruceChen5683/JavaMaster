package com.cjl.www;

public class FinalTest2 {

    /**
     * final 引用类型 指向的 对象引用不可变，内容是可以变的
     */
    public static final StringBuffer sb = new StringBuffer();


//    public static String s = new String("original");
//    public static final String ss = s;

    public static void main(String[] args) {
        sb.append("aaa");

//        s = new String("ccc");
//
//        System.out.println("FinalTest2.main "+ss);
    }
}
