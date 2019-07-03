package com.cjl.pattern.wrapper;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class ConcreatDecorator2 extends Decorator{

    public ConcreatDecorator2(Component component) {
        super(component);
    }

    @Override
    public void set() {
        super.set();
        this.setB();
    }

    public void setB(){
        System.out.println("ConcreatDecorator2.setB");
    }
}
