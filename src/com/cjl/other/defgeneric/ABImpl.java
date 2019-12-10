package com.cjl.other.defgeneric;

public class ABImpl<T> implements A,B{

//    private static T instance;
    public static <T> T getInstance(){
        return null;
    }

    @Override
    public void a() {

    }

    @Override
    public void b() {

    }


    public static <T extends A&B> T getName(T a){
        return a;
    }

    public static void main(String[] args) {
        getName(new ABImpl());
    }

}
