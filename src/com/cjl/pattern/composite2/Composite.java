package com.cjl.pattern.composite2;

import java.util.ArrayList;
import java.util.List;

public class Composite implements Compoent{

    private List<Compoent> list = new ArrayList<Compoent>();

    public void add(Compoent compoent){
        list.add(compoent);
    }

    public void remove(Compoent compoent){
        list.remove(compoent);
    }

    public List<Compoent> getAll(){
        return this.list;
    }
    @Override
    public void doSth() {
        for (Compoent compoent:list){
            compoent.doSth();
        }
    }
}
