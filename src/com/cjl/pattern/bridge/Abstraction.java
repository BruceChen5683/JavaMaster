package com.cjl.pattern.bridge;

public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor implementor){
        this.implementor = implementor;
    }

    public void operation(){
        implementor.operationImp();
    }
}