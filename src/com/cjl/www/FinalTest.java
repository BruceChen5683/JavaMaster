package com.cjl.www;

public class FinalTest {

    /**
     * 1. 声明时赋值
     *
     * 2. 构造中赋值,如果一个类有多个构造方法，需要每个构造中都完成final 初始化
     *
     *  final static 只能声明中赋值
     */

//    private final int a ;
//    private final static int a;
    private final static int a = 3;

    private String name;

    public FinalTest() {
//        a = 3;
    }

    public FinalTest(String name){
//        a = 5;
        this.name = name;
    }

}
