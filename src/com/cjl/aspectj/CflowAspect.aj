package com.cjl.aspectj;

/**
 *
 * 原作者
 * https://blog.csdn.net/zl3450341/article/details/7673967
 * cfow()获取的是一个控制流程。他很少几乎不单独使用，一般与其他的pointcut 进行 &&运算。
 * ----------------------------若要单独使用，一定要记得用!with()剔除asepct 本身。-----------------------
 * 他是我最喜欢，也是我用的最多的功能，在实际的应用中也用的最广，请好好掌握他。
 */
public aspect CflowAspect {
    pointcut barPoint():execution(* bar(..));
    pointcut fooPoint():execution(* foo(..));

    pointcut barCflow():cflow(barPoint()) && !within(CflowAspect);
    pointcut fooInBar():barCflow() && fooPoint();//获取bar流程内的foo方法调用

    before() : barCflow(){
        System.out.println("进入 "+thisJoinPoint);
    }

    /**
     * 只拦截bar方法调用里面的foo方法
     */
    before() :fooInBar(){
        System.out.println("CflowAspect.进入 "+thisJoinPoint);
        System.out.println("CflowAspect.进入 "+thisJoinPoint.getSourceLocation());
    }

}
