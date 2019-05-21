package com.cjl.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class FanXingTest {
    public void method1(List<Object> list){

    }

    public void method2(){

        /**
         * 关于泛型的继承
         *
         * ArrayList<Object>  继承了List<Object>
         * ArrayList<String> 没有继承List<Object>
         */


        method1(new ArrayList<Object>());

//        method1(new ArrayList<String>());   wrong
//
//        method1(new LinkedList<Integer>());  wrong

        method1(new LinkedList<Object>());
    }


    /**
     *
     * ? ｅxtends Object，继承Ｏｂject的类即可
     */

    public void method3(List<? extends Object> list){

    }

    public void method4(){
        method3(new ArrayList<Object>());
        method3(new ArrayList<String>());
        method3(new LinkedList<Integer>());
    }

    /**
     *
     * List<?> 等价于 List<? extends Object>
     */

    public void method5(List<?> list){

    }

    public void method6(){
        method5(new ArrayList<Object>());
        method5(new ArrayList<String>());
        method5(new LinkedList<Integer>());
    }


}
