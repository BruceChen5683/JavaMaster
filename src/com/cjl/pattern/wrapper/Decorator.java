package com.cjl.pattern.wrapper;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }
    @Override
    public void set() {
        component.set();
    }

}
