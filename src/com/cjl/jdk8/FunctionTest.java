package com.cjl.jdk8;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {
    public static void main(String[] args) {
        FunctionTest functionTest = new FunctionTest();

        System.out.println("FunctionTest.main "+ functionTest.compute(1,a->{return a*2;}));

        functionTest.compute(1,value->value+5);

        System.out.println("FunctionTest.main "+functionTest.convert(1,v->v+"----he"));

        Function<Integer,Integer> function = a->a*2;
        functionTest.compute(1,function);

        Function<Integer,Integer> function1 = a->a+3;


        Function<String,Integer> function11 = a -> Integer.valueOf(a);

        Function<String,Integer> ff = function.compose(function11);

        Function<Integer,Integer> function2 = function.compose(function1);
        Function<Integer,Integer> function3 = function1.compose(function);


        System.out.println("FunctionTest.main "+functionTest.compute(1,function2));
        System.out.println("FunctionTest.main "+functionTest.compute(1,function3));

        System.out.println("FunctionTest.main function2   "+         Predicate.isEqual(2).test(functionTest.compute2("1",ff)));
        System.out.println("FunctionTest.main function3   "+         Predicate.isEqual(5).test(functionTest.compute(1,function3)));


        Function<Integer,Integer> function4 = function.andThen(function1);
        Function<Integer,Integer> function5 = function1.andThen(function);


        System.out.println("FunctionTest.main function4   "+Predicate.isEqual(5).test(functionTest.compute(1,function4)));
        System.out.println("FunctionTest.main function5   "+Predicate.isEqual(8).test(functionTest.compute(1,function5)));

        System.out.println("FunctionTest.main " + Predicate.isEqual(11).test(functionTest.compute2("11",function11)));


        Function<String,Integer> function6 = function11.andThen(function3);


        System.out.println("FunctionTest.main " + Predicate.isEqual(25).test(functionTest.compute2("11",function6)));




        BiFunction<Integer,Integer,Integer> function8 = (a,b)->a+b ;


        BiFunction<Integer,Integer,Integer> aa = (a,b)->{return a+b;};

        System.out.println("FunctionTest.main " + Predicate.isEqual(7).test(functionTest.compute3(3,4,aa)));



        System.out.println("FunctionTest.main identity "+functionTest.compute4("aasf",Function.identity()));

        Temp temp = new Temp();
        temp.setName("ccc");

        System.out.println("FunctionTest.main "+temp);

        System.out.println("FunctionTest.main identity "+functionTest.compute4(temp,Function.identity()));


    }

    public int compute(int a, Function<Integer,Integer> function){
        int result = function.apply(a);
        return result;
    }

    public int compute2(String a, Function<String,Integer> function){
        int result = function.apply(a);
        return result;
    }

    public String convert(int a,Function<Integer,String> function){
        return function.apply(a);
    }

    public int compute3(int a,int b,BiFunction<Integer,Integer,Integer> function){
        return function.apply(a,b);
    }

    public Object compute4(Object a,Function<Object,Object> function){
        return function.apply(a);
    }


}

class Temp{
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString()+"   "+"Temp{" +"name='" + name + '\''+'}';
    }

//    //    @Override
//    public String toString() {
//        return "Temp{" +
//                "name='" + name + '\'' +
//                '}';
//    }
}
