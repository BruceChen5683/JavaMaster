package com.cjl.pattern.wrapper;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class ConcreateDecoratorTestInterFaceB extends DecoratorTestInterface{
    public ConcreateDecoratorTestInterFaceB(TestInterface testInterface) {
        super(testInterface);
    }

    @Override
    public void set() {
        super.set();
        this.getss();
    }

    private void getss(){
        System.out.println("ConcreateDecoratorTestInterFaceB.getss  CCCC");
    }
}
