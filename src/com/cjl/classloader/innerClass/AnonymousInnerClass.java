package com.cjl.classloader.innerClass;

import java.util.Date;

/**
 * Created by chenjianliang on 2017/5/19.
 * 匿名内部类
 */
public class AnonymousInnerClass {
    @SuppressWarnings("deprecation")
    public String get(Date date){
        return date.toLocaleString();
    }


    public void invokeInterfaceGo(OutInterface outInterface){
        outInterface.go();
    }

    public static void main(String[] args) {
        AnonymousInnerClass anonymousInnerClass = new AnonymousInnerClass();

        String str = anonymousInnerClass.get(new Date(){

            @Override
            public String toLocaleString() {
                return "哈哈哈哈";
//                return super.toLocaleString();
            }
        });

        System.out.println(str);


        anonymousInnerClass.invokeInterfaceGo(new OutInterfaceImpl(){
            @Override
            public void go() {
//                super.go();
            }
        });
    }
}
