package com.cjl.aspectj.around;

/**
 *
 */
public aspect HiMan3Aspect {
    /**
     * execution
     * 【可选修饰符】 返回值类型    方法名（参数）                       【可选异常模式】
     *             void        com.cjl.aspectj.HiMan3.main(int)
     *             *           com.cjl.aspectj.HiMan3.main(int)
     *             *            com.cjl.aspectj.HiMan3.main(..)
     *
     * execution(public *.*(..))　　所有的public方法。
     * execution(* hello(..))            所有的hello()方法
     * execution(String hello(..))   所有返回值为String的hello方法。
     * execution(* hello(String))  　　所有参数为String类型的hello()
     * execution(* hello(String..))      至少有一个参数，且第一个参数类型为String的hello方法
     * execution(* com.aspect..*(..))  　所有com.aspect包，以及子孙包下的所有方法
     * execution(* com..*.*Dao.find*(..))　　com包下的所有一Dao结尾的类的一find开头的方法　
     */

    /**
     * 俩个main方法，只拦截带int参数的
     */
    pointcut HiManPointCut() : execution(void com.cjl.aspectj.HiMan3.main(int));

    /**
     * 获取main方法里的参数
     */

    pointcut HiManPointCut2(int i) : execution(* com.cjl.aspectj.HiMan3.main(int)) && args(i);

    pointcut HiManPointCutCall() : call(* main(int));
    pointcut HiManPointCutExecution() : execution(* main(int));

    //    call、execution端输出如下
    //    call 进入... HiMan3.java:7
    //    execution 进入... HiMan3.java:10
    /**
     * 执行点
     */
    before() : HiManPointCutExecution(){
        System.out.println("execution 进入... "+thisJoinPoint.getSourceLocation());
    }

    /**
     * 调用点
     */
    before() : HiManPointCutCall(){
        System.out.println("call 进入... "+thisJoinPoint.getSourceLocation());
    }

    before(int x) : HiManPointCut2(x){
        x+=5;
        System.out.println("before himan3 Main, i = "+x);
    }

    before() : HiManPointCut(){
        System.out.println("before himan3 Main");
    }


}
