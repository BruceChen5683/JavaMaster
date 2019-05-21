package com.cjl.www;

public class StringTest {

    public static void main(String[] args) {
        String s = new String("abc");
        String s1 = "abc";
        String s2 = new String("abc");


        System.out.println(s==s1);
        System.out.println(s==s2);
        System.out.println(s1==s2);

        System.out.println(s==s.intern());
        System.out.println(s1==s1.intern());
        System.out.println(s.intern()==s2.intern());
        System.out.println(s1==s.intern());


        test();
    }

    private static void test() {
        System.out.println("StringTest.test");
        String s = new String("1");
        s.intern();
        String s2 = "1";
        System.out.println(s == s2);

        String s3 = new String("1") + new String("1");
        s3.intern();
        String s4 = "11";
        System.out.println(s3 == s4);
    }

}
