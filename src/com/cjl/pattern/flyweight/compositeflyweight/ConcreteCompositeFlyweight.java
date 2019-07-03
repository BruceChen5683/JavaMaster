package com.cjl.pattern.flyweight.compositeflyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 复合享元角色
 */
public class ConcreteCompositeFlyweight implements Flyweight{
    private Map<String,Flyweight> files = new HashMap<String, Flyweight>();

    public void add(String key,Flyweight flyweight){
        files.put(key,flyweight);
    }

    @Override
    public void operation(String extrinsicState) {
        Flyweight flyweight = null;
        for (Object o:files.keySet()){
            flyweight = files.get(o);
            flyweight.operation(extrinsicState);
        }
    }
}
