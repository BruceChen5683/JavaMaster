package com.cjl.aspectj.annotation;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

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

@Aspect
public class AnnotationAspect {
    @Pointcut("execution(@com.cjl.aspectj.annotation.TimeLog * *(..))")
    public void aspectTimeLog(){

    }

//    @Before("aspectTimeLog()")
//    public void testExecute(){
//        System.out.println("AnnotationAspect.testExecute......................before");
//    }

    @Around("aspectTimeLog()")
    public void testExecute(ProceedingJoinPoint joinPoint) throws Throwable{


        System.out.println("AnnotationAspect.testExecute around "+joinPoint.getSourceLocation());
        Signature signature = joinPoint.getSignature();
        if (signature instanceof MethodSignature){
            MethodSignature methodSignature = (MethodSignature) signature;
            Method method = methodSignature.getMethod();

            System.out.println("AnnotationAspect.testExecute "+method.getName());
            TimeLog annotation = method.getAnnotation(TimeLog.class);

            joinPoint.proceed();//执行原方法
            
            System.out.println("AnnotationAspect.testExecute  "+annotation.module());
            System.out.println("AnnotationAspect.testExecute  "+annotation.num());

//            if (method.isAnnotationPresent(TimeLog.class)){
//
//            }

//            for (Annotation annotation:method.getAnnotations()){
//                Annotation[] allMAnnos = method.getAnnotations();
//                Annotation[] deMAnnos = method.getDeclaredAnnotations();
//                printAnnotation("allMAnnos",allMAnnos);
//                printAnnotation("deMAnnos",deMAnnos);
//                printAnnotation("TimeLog",subMAnno);
//            }


        }
    }

    private static void printAnnotation(String msg,Annotation... annotations){
        System.out.println("=============="+msg+"======================");
        if(annotations == null){
            System.out.println("Annotation is null");
        }
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
        System.out.println();
    }
}
