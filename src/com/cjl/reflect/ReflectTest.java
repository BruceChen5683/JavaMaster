package com.cjl.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by chenjianliang on 2017/5/5.
 */
public class ReflectTest {

    public ReflectTest() {
    }

    public Object copy(Object object) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class<?> classType = object.getClass();
//        Object result = classType.newInstance();//没有参数的构造
        Constructor constructor = classType.getConstructor(new Class[]{int.class,String.class});
        Object obj = constructor.newInstance(new Object[]{10,"chen"});
        System.out.println("obj = " + obj);
        System.out.println("obj2 = " + classType.newInstance());

        
        Field[] fields =  classType.getDeclaredFields();
        for (Field field:fields){
            System.out.println("field = " + field);


        }

        return null;
    }

    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        int sum = 0;


        Customer customer = new Customer();
        ReflectTest reflectTest1 = new ReflectTest();
        reflectTest1.copy(customer);

        Class<?> classType = Class.forName("com.cjl.reflect.ReflectTest");
//        classType = ReflectTest.class;

        Object reflectTest = classType.newInstance();  // ReflectTest一个实例


        System.out.println("classType.getName() = " + classType.getName());
        
        
//        ReflectTest tt = (ReflectTest) reflectTest;
//        sum = tt.set(1,22);
//        System.out.println("sum = " + sum);


        Method addMethod =
                  classType.getMethod("set",new Class[]{int.class,int.class});

        Object result = addMethod.invoke(reflectTest,new Object[]{1,2});


        System.out.println("result = " + result);

        for (Method method :classType.getDeclaredMethods()) {
            System.out.println("method = " + method);
        }



        Class<?> pclassType = PrivateMethod.class;

        for (Method method:pclassType.getDeclaredMethods()){
            System.out.println("getDeclaredMethods method = " + method);
        }

        for (Method method:pclassType.getMethods()){
            System.out.println("getMethods method = " + method);
        }

        PrivateMethod p = new PrivateMethod();
        Method pmethod = pclassType.getDeclaredMethod("sayHello",new Class[]{String.class});
        pmethod.setAccessible(true);
        String str =(String) pmethod.invoke(p,new Object[]{"cjl"});
        System.out.println("str = " + str);



        Field field = pclassType.getDeclaredField("name");

        field.setAccessible(true);
        field.set(p,"lisi");
        
        Method methodGetName = pclassType.getMethod("getName",new Class[]{});
        String name = (String) methodGetName.invoke(p,new Object[]{});
        System.out.println("name = " + name);


    }

    public int set(int parm1,int parm2){
        return parm1+parm2;
    }

    private boolean hi(){
        return false;
    }

}

class Customer{
    protected int id;
    public String name;

    public Customer() {

    }

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

