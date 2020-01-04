package com.cjl.algorithm.datastructure;

import java.util.ArrayList;

public class CStackImpl<String> implements CStackInterface<String>{
    private ArrayList<String> list = new ArrayList<String>();

    @Override
    public String pull() {
        if (list.isEmpty()){
            return null;
        }
        String last = list.get(size()-1);
        list.remove(size()-1);
        return last;
    }

    @Override
    public void push(String o) {
        list.add(o);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty() ? true : false;
    }

    @Override
    public int size() {
        return list.size();
    }
}
