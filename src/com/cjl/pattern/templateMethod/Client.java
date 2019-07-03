package com.cjl.pattern.templateMethod;

public class Client {
    public static void main(String[] args) {
        AbstractClass abstractClass = new ConcreteClass();
        abstractClass.template();
    }
}
