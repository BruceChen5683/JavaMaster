package com.cjl.aspectj;

/**
 * Methods and Constructors
 *  call 方法和构造函数的调用点
 *  execution 方法和构造函数的执行点
 * Fields
 *  get
 *  set
 *
 * Advice
 *  before(formals)
 *  after(formals) returining
 *  after throwing
 *  after
 *  Type around
 *
 * Control Flow
 *  cflow(Pointcut)	every join point in the control flow of each join point P picked out byPointcut, including P itself
 *  (捕获所有的连接点在指定的方法执行中，包括执行方法本身)
 *  cflowbelow(Pointcut)	every join point below the control flow of each join point P picked out byPointcut; does not include P itself　（
 *  捕获所有的连接点在指定的方法执行中，除了执行方法本身）
 *
 * Lexical
 *  within  	every join point from code defined in a type in TypePattern  (捕获在指定类或者方面中的程序体中的所有连接点，包括内部类)
 *  withincode  every join point from code defined in a method or constructor matching Signature (用于捕获在构造器或者方法中的所有连接点，包括在其中的本地类)
 *
 * TODO witnincode ???
 *
 */
public aspect HiMan2Aspect {
    pointcut HiManPointCut() : execution(* com.cjl.aspectj.HiMan2.main(..));

    before() : HiManPointCut(){
        System.out.println("before himan Main");
    }

    after() : HiManPointCut(){
        System.out.println("after himan Main");
    }

    void around() : call(void HiMan2.sayHi()){
        System.out.println("start...");
        proceed();
        System.out.println("end...");
    }
}
