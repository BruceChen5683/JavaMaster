package com.cjl.interview;

public class SingleTon {

//    private static SingleTon singleTon = new SingleTon();
//
//    /**
//     * private 外部不可创建
//     */
//    private SingleTon() {
//    }
//
//    /**
//     *
//     * static　
//     */
//    public static SingleTon getInstance(){
//        return singleTon;
//    }



    private static SingleTon singleTon;

    private SingleTon(){

    }

    public static SingleTon getInstance(){
        if (null == singleTon){
            singleTon = new SingleTon();
        }
        return singleTon;
    }
}
