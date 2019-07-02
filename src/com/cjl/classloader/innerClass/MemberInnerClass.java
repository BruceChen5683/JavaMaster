package com.cjl.classloader.innerClass;

/**
 * Created by chenjianliang on 2017/5/19.
 * 成员内部类
 */

class MemberInner{
    private int a = 4;

    public class Inner2{
        private int a = 5;
        public void  doSth(){
            System.out.println(MemberInner.this.a);
            System.out.println(a);
            System.out.println(this.a);

        }
    }
}
public class MemberInnerClass {
    public static void main(String[] args) {
        MemberInner memberInner = new MemberInner();
        MemberInner.Inner2 inner2 = memberInner.new Inner2();

        inner2.doSth();
    }
}
