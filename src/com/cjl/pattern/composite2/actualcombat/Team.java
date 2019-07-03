package com.cjl.pattern.composite2.actualcombat;

import java.util.List;

public abstract class Team {
    public void add(Team team){
        throw new UnsupportedOperationException("不支持add");
    }

    public void remove(Team team){
        throw new UnsupportedOperationException("不支持remove");
    }

    public abstract void print(String string);

    public List<Team> getAll(){
        throw new UnsupportedOperationException("getAll");
    }
}
