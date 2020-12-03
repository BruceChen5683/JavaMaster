package com.cjl.aspectj;

public aspect AfterManAspect {
    pointcut getName():call(String AfterMan.getName());
    
    after() returning(Object o):getName(){
        System.out.println("AfterManAspect.Return o "+o);
    }
    
    after() throwing (Exception e):getName(){
        System.out.println("AfterManAspect. exception "+e);
    }
    
    after():getName(){
        System.out.println("AfterManAspect.return or throw an exception");
    }
}
