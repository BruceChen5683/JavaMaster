package com.cjl.jdk6;

public class StringTest {
    public static void main(String[] args) {
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);
//        System.out.println(s.intern()==s2);

        String s3 = new String("1") + new String("1");
        s3.intern();

        String s4 = "11";
        System.out.println(s3 == s4);

        System.out.println("StringTest.main-------------");


        String l = new String("abc");
        String l1 = "abc";
        String l2 = new String("abc");


        System.out.println(l == l1);
        System.out.println(l == l2);
        System.out.println(l1 == l2);

        System.out.println(l.intern()==l1);

        System.out.println("--------------------------");

        String hello  = "hello";
        String lo = "lo";
        System.out.println(hello == "hel"+"lo");
        System.out.println(hello == "hel"+lo);






//        int i = 0;
//        while(true){
//            String.valueOf(i++).intern();
//            System.out.println(i);
//        }

    }


}
