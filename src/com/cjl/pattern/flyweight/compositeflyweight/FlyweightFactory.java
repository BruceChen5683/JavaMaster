package com.cjl.pattern.flyweight.compositeflyweight;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
    private Map<String,Flyweight> flyweightMap = new HashMap<String, Flyweight>();

    public Flyweight factory(List<String> compositeState){
        ConcreteCompositeFlyweight concreteCompositeFlyweight = new ConcreteCompositeFlyweight();
        for (String state:compositeState){
            concreteCompositeFlyweight.add(state,this.factory(state));
        }
        return concreteCompositeFlyweight;
    }

    public Flyweight factory(String state){
        Flyweight flyweight = flyweightMap.get(state);
        if(flyweight == null){
            flyweight = new ConcreteFlyweight(state);
            flyweightMap.put(state,flyweight);
        }
        return flyweight;
    }
}
