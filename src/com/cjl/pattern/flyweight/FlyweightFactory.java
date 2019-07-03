package com.cjl.pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂
 * 在享元模式中，客户端不能直接创建共享的享元对象实例，必须通过享元工厂创建
 */
public class FlyweightFactory {

    private Map<String,Flyweight> flyweightMap = new HashMap<String, Flyweight>();

    public Flyweight factory(String key){
        Flyweight flyweight = flyweightMap.get(key);
        if(flyweight == null){
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key,flyweight);
        }
        return flyweight;
    }
}
