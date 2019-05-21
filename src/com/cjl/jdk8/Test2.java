package com.cjl.jdk8;

public class Test2 {
    public static void main(String[] args) {
        new Test2().test(new MyInterface() {
            @Override
            public void add() {
                System.out.println("Test2.add");
            }
        });

        new Test2().test( () -> System.out.println("Test2.main  lambda add"));


        MyInterface myInterface = ()-> System.out.println("Test2.*********");

        System.out.println("Test2.main myInterface "+myInterface.getClass());
        System.out.println("Test2.main myInterface getSuperclass"+myInterface.getClass().getSuperclass());

        System.out.println("Test2.main myInterface getInterfaces length"+myInterface.getClass().getInterfaces().length);
        System.out.println("Test2.main myInterface getInterfaces "+myInterface.getClass().getInterfaces()[0]);

        System.out.println("Test2.main "+myInterface.getClass().getDeclaredMethods().length);

        myInterface.set(myInterface);



    }

    public void test(MyInterface myInterface){
        System.out.println("Test2.test 1");
        myInterface.add();
        System.out.println("Test2.test  2");
    }


}
