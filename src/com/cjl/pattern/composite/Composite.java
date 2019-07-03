package com.cjl.pattern.composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 1)将管理子元素的方法定义在Composit类中
 * 2）将管理子元素的方法定义在Compoent接口中，这样Leaf类需要对这些方法空实现
 *
 * */
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
