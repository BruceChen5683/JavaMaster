package com.cjl.pattern.wrapper;

/**
 * Created by chenjianliang on 2017/5/23.
 */
public class Client {
    public static void main(String[] args) {
        //节点流
        Component component = new ConCreateComponent();

        Component component1 = new ConcreateDecorator(component);

        Component component2 = new ConcreatDecorator2(component1);


        component2.set();

//        component.set();

//        component1.set();

    }
}
