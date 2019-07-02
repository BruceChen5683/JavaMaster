package com.cjl.ognl;

import ognl.Ognl;
import ognl.OgnlContext;
import ognl.OgnlException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenjianliang on 2018/6/1.
 */
public class OgnlTest {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("test1");
        Dog dd = new Dog();
        dd.setName("dog2");
        person.setDog(dd);

        Dog dog = new Dog();
        dog.setName("dog1");

        OgnlContext context = new OgnlContext();
        context.put("person",person);
        context.put("dog",dog);

        context.setRoot(person);

        try {
            Object object = Ognl.parseExpression("name");
            System.out.println("OgnlTest.main "+object);


            Object object2 = Ognl.getValue(object,context,context.getRoot());
            System.out.println("OgnlTest.main "+object2);


            System.out.println("OgnlTest.main-------------------------------");
            Object object3 = Ognl.parseExpression("#person.dog.name");
            System.out.println("OgnlTest.main "+object3);

            Object object4= Ognl.getValue(object3,context,context.getRoot());
            System.out.println("OgnlTest.main "+object4);
            System.out.println("OgnlTest.main-------------------------------");


            Object object5 = Ognl.parseExpression("#dog.name");
            System.out.println("OgnlTest.main "+object5);

            Object object6 = Ognl.getValue(object5,context,context.getRoot());
            System.out.println("OgnlTest.main "+object6);

            Object object7 = Ognl.parseExpression("#dog.getTT()");
            System.out.println("OgnlTest.main "+object7);

            Object object8 = Ognl.getValue(object7,context,context.getRoot());
            System.out.println("OgnlTest.main "+object8);


            Object staticMethod = Ognl.parseExpression("@java.lang.Integer@toBinaryString(10)");
            Object staticMethodValue = Ognl.getValue(staticMethod,context,context.getRoot());


            System.out.println("OgnlTest.main "+staticMethodValue);


            System.out.println("OgnlTest.main  special" + Ognl.getValue(Ognl.parseExpression("@@min(10,9)"),context,context.getRoot()));

            //表达式生成对象
            Object object9 = Ognl.parseExpression("new java.util.LinkedList()");
            System.out.println("OgnlTest.main "+object9);
            Object object10 = Ognl.getValue(object9,context,context.getRoot());
            System.out.println("OgnlTest.main "+object10);

            System.out.println("OgnlTest.main "+ Ognl.getValue("@@min(10,11)",context,context.getRoot()));

            //generate list
            System.out.println("OgnlTest.main  " +Ognl.getValue("{'a','b','c'}",context,context.getRoot()));

            System.out.println("OgnlTest.main  " +Ognl.getValue("{'a','b','c'}[2]",context,context.getRoot()));




            List list = new ArrayList<>();
            list.add("aa");
            list.add("bbcc");
            list.add("ccddee");
/*
*
* ognl.OgnlException: source is null for getProperty(null, "1")
	at ognl.OgnlRuntime.getProperty(OgnlRuntime.java:2223)
	at ognl.ASTProperty.getValueBody(ASTProperty.java:114)
	at ognl.SimpleNode.evaluateGetValueBody(SimpleNode.java:212)
	at ognl.SimpleNode.getValue(SimpleNode.java:258)
	at ognl.ASTChain.getValueBody(ASTChain.java:141)
	at ognl.SimpleNode.evaluateGetValueBody(SimpleNode.java:212)
	at ognl.SimpleNode.getValue(SimpleNode.java:258)
	at ognl.Ognl.getValue(Ognl.java:494)
	at ognl.Ognl.getValue(Ognl.java:596)
	at ognl.Ognl.getValue(Ognl.java:566)
	at ml.battlecall.ognl.OgnlTest.main(OgnlTest.java:92)
	at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
	at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
	at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
	at java.lang.reflect.Method.invoke(Method.java:498)
	at com.intellij.rt.execution.application.AppMain.main(AppMain.java:147)
	*/
            context.put("list",list);
            System.out.println("OgnlTest.main   "+Ognl.getValue("#list[1]",context,context.getRoot()));


            //map
            System.out.println("OgnlTest.main   "+Ognl.getValue("#{'key1':'value1','key2':'value2'}['key1']",context,context.getRoot()));

            //filter
            List<Person> personList = new ArrayList<>();
            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();
            person1.setName("zhangsan");
            person2.setName("lisi");
            person3.setName("wangwu");
            personList.add(person1);
            personList.add(person2);
            personList.add(person3);

            context.put("persons",personList);


            //            过滤 filtering :collection.{? expression}
            System.out.println("OgnlTest.main   "+Ognl.getValue("#persons.{? #this.name.length() > 4}",context,context.getRoot()));
            //property
            System.out.println("OgnlTest.main   "+Ognl.getValue("#persons.{? #this.name.length() > 4}.size",context,context.getRoot()));

            //    获取集合中的符合条件的第一个元素        过滤 filtering :collection.{^ expression}
            System.out.println("OgnlTest.main   "+Ognl.getValue("#persons.{^ #this.name.length() > 4}",context,context.getRoot()));

            //    获取集合中的符合条件的最后一个元素        过滤 filtering :collection.{$ expression}


            //            11. `投影（projection）: collection.{expression}`

            System.out.println("OgnlTest.main  "+Ognl.getValue("#persons.{name}",context,context.getRoot()));


            System.out.println("OgnlTest.main  "+Ognl.getValue("#persons.{#this.name.length() > 5 ? #this.name:'helloworld'}",context,context.getRoot()));




            System.out.println("OgnlTest.main  "+Ognl.getValue("#persons.{? #this.name.length() > 5 ? #this:#this}.{name}",context,context.getRoot()));

//            System.out.println("OgnlTest.main  "+Ognl.getValue("#persons.{name}.{this}.length() > 5",context,context.getRoot()));






        } catch (OgnlException e) {
            e.printStackTrace();
        }
    }
}
