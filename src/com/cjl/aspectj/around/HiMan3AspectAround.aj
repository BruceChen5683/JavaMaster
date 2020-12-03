package com.cjl.aspectj.around;

/**
 * around 结合proceed 可改变输入值
 */
public aspect HiMan3AspectAround {

    pointcut HiMan3PointCut(int x):execution(int main(int)) && within(com.cjl.aspectj.HiMan3) && args(x);

    int around(int x):HiMan3PointCut(x){
        System.out.println("HiMan3AspectAround.   输入 "+x);
        System.out.println("HiMan3AspectAround.进入 "+ thisJoinPoint.getSourceLocation());
        int newValue = proceed(x*4);
        return newValue;
    }
}
