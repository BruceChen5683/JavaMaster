package com.cjl.pattern.wrapper;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class ConcreateDecorator extends Decorator{

    public ConcreateDecorator(Component component) {
        super(component);
    }

    @Override
    public void set() {
        super.set();

        this.setA();
    }

    private void setA(){
        System.out.println("ConcreateDecorator.setA");
    }
}
