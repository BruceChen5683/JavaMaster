package com.cjl.pattern.singleton;

/**
 * Created by chenjianliang on 2017/5/29.
 */
public class Singleton {

    private static Singleton singleton;
//

    private Singleton(){

    }
    public static synchronized Singleton getInstance(){
        if (singleton == null){
//            try {
//                Thread.sleep(10 );
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            singleton = new Singleton();
        }
        return singleton;
    }

    public void test(){
        System.out.println("Singleton.test");
        singleton = null;
    }

}
