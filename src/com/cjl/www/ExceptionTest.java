package com.cjl.www;

/**
 * 关于方法重写override
 *
 * 1.子类中的方法与父类的方法有相同的返回、相同的方法名称、相同的参数列表
 *
 * 2.子类中的方法的访问级别不能低于父类中该方法的访问级别
 *
 * 3.子类中方法抛出的异常范围不能大于父类中方法抛出的异常的范围
 *
 */
public class ExceptionTest {
    public static void main(String[] args) {
        EParent parent = new EChild();
        parent.test();
    }
}

class EParent{
    public void test() throws NullPointerException{
        System.out.println("Parent.test");
    }

}

class EChild extends EParent{

//    public void test() throws Exception{
//        System.out.println("Child.test");
//    }
}
