package com.cjl.pattern.composite2;

import java.util.List;

public interface Compoent {
    public void doSth();
    public void add(Compoent compoent);
    public void remove(Compoent compoent);
    public List<Compoent> getAll();
}
