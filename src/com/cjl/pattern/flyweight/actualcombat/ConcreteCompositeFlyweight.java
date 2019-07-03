package com.cjl.pattern.flyweight.actualcombat;

import java.util.HashMap;
import java.util.Map;

public class ConcreteCompositeFlyweight implements Flyweight{
    private Map<String,Flyweight> files = new HashMap<String, Flyweight>();

    public void add(String key,Flyweight flyweight){
        files.put(key,flyweight);
    }

    @Override
    public void order(String user) {
        Flyweight flyweight = null;
        for (Object o:files.keySet()){
            flyweight = files.get(o);
            flyweight.order(user);
        }
    }
}
