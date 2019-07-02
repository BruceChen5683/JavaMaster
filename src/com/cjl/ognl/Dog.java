package com.cjl.ognl;

public class Dog {
    private String name;

    public String getName() {
        return name;
    }

    public String getTT(){
        System.out.println("Dog.getTT  TT invoked");
        return "TT";
    }

    public String getParm(String s){
        System.out.println("Dog.getParm  parm invoked : "+s);
        return s;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}
