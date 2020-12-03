package com.cjl.aspectj.difference;

public aspect MoveAspect {
    //拦截所有move调用点
    /**
     * MoveAspect.进入 Move.java:11
     * MoveAspect.进入 Move.java:16
     * Bird.move
     * MoveAspect.进入 Move.java:16
     * Snake.move
     */
//    pointcut MoveAspect(): call(* move(..));
    /**
     * MoveAspect.进入 Move.java:16
     * Bird.move
     * MoveAspect.进入 Move.java:16
     * Snake.move
     */
//    pointcut MoveAspect():call(* move(..)) && target(Animal);

    /**
     * Bird.move
     * Snake.move
     */
//    pointcut MoveAspect():call(* move(..)) && this(Animal);

//    pointcut MoveAspect():call(* move(..)) && this(Move);

//    pointcut MoveAspect():call(* move(..)) && within(Bird);

//    pointcut MoveAspect():call(* move(..)) && target(Animal) && this(Move);

//    before():MoveAspect(){
//        System.out.println("MoveAspect.进入 "+thisJoinPoint.getSourceLocation());
//    }

    pointcut MoveAspect2(Animal animal,Move move):call(* move(..)) && target(animal) && this(move);

    before(Animal animal,Move target):MoveAspect2(animal,target){
        System.out.println("MoveAspect.进入 "+thisJoinPoint.getSourceLocation() + "\ntarget "+animal+"\nthis "+ target);
    }
}
//target this 动态