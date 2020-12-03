package com.cjl.aspectj;

public aspect HiManAspect {
    pointcut HiManPointCut() : execution(* com.cjl.aspectj.HiMan.main(..));

    before() : HiManPointCut(){
        System.out.println("before himan Main");
    }

    after() : HiManPointCut(){
        System.out.println("after himan Main");
    }

}
