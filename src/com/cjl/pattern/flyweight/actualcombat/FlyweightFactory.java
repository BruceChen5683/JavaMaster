package com.cjl.pattern.flyweight.actualcombat;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> flyweightMap = new HashMap<String, Flyweight>();

    public Flyweight factory(List<String> compositeState){
        ConcreteCompositeFlyweight compositeFlyweight = new ConcreteCompositeFlyweight();
        for (String state:compositeState){
            compositeFlyweight.add(state,factory(state));

        }
        return compositeFlyweight;
    }

    public Flyweight factory(String key){
        Flyweight flyweight = flyweightMap.get(key);
        if(flyweight == null){
            flyweight = new ConcreteFlyweight(key);
            flyweightMap.put(key,flyweight);
        }
        return flyweight;
    }

    public int getFlyweightSize(){
        return flyweightMap.size();
    }
}
