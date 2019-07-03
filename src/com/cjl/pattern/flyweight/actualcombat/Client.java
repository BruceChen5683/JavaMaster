package com.cjl.pattern.flyweight.actualcombat;

import com.cjl.pattern.memento.Memento;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory flyfactory = new FlyweightFactory();
        List<String> compositeState = new ArrayList<>();
        compositeState.add(Menu.sltds);
        compositeState.add(Menu.scy);
        compositeState.add(Menu.szrp);
        compositeState.add(Menu.mf);
        Flyweight flyweight1 = flyfactory.factory(compositeState);
        flyweight1.order("张三点菜");

        List<String> compositeState2 = new ArrayList<>();
        compositeState2.add(Menu.mf);
        compositeState2.add(Menu.sltds);
        Flyweight flyweight2 = flyfactory.factory(compositeState2);
        flyweight2.order("李四点菜");

        Flyweight fly3 = flyfactory.factory(Menu.sltds);
        fly3.order("王五点菜");

        Flyweight fly4 = flyfactory.factory(Menu.sltds);
        fly4.order("刘六点菜");

        Flyweight fly5 = flyfactory.factory(Menu.sltds);
        fly5.order("赵七点菜");

        System.out.println(flyfactory.getFlyweightSize());

    }
}
