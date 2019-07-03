package com.cjl.pattern.command.actualcombat.note;

import java.io.Serializable;

public abstract class Command implements Serializable{
    private static final long serialVersionUID = 1L;

    protected String name;
    protected String args;
    protected Operator operator;

    public Command(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOperator(Operator operator){
        this.operator = operator;
    }

    public abstract void execute(String args);
    public abstract void execute();
}
