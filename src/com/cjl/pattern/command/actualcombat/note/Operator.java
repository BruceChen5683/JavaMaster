package com.cjl.pattern.command.actualcombat.note;

import java.io.Serializable;

public class Operator implements Serializable{
    private static final long serialVersionUID = 1L;
    public void insert(String args){
        System.out.println("Operator.insert "+ args);
    }

    public void update(String args){
        System.out.println("Operator.update  "+args);
    }

    public void delete(String args){
        System.out.println("Operator.delete  "+args);
    }
}
