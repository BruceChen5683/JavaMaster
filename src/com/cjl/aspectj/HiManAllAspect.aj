package com.cjl.aspectj;

/**
 * 多个main 其中一个HiMan3中的不捕获
 */
public aspect HiManAllAspect {
    public static int i = 0;
    pointcut HiManPointCut():execution(* main(..)) && !within(HiMan3);
    
    pointcut HiMethod():execution(* method*(..));
//
    pointcut HiMethodInclude():withincode(* com.cjl.aspectj.HiMethod.method2(..));
//
    before():HiMethodInclude(){
        System.out.println("HiManAllAspect.include "+thisJoinPoint.getSourceLocation());
    }
    
    before():HiMethod(){
        System.out.println("HiManAllAspect.before all method... "+ i++);
    }
    
    before():HiManPointCut(){
        System.out.println("HiManAllAspect. before all");
    }
}
