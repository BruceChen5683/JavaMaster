package com.cjl.pattern.singleton.testmore;

import com.cjl.pattern.memento.actualcombat.Sys;
import com.cjl.pattern.singleton.*;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingleTest {

    private static final String FILE = "test_crack_serializable.txt";

    public static void main(String[] args) {


        for (int i = 0;i < 10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println("SingleTest.run "+ Singleton11.getInstance());
                }
            }).start();
        }

        //crack  by reflect

        try {
            Class clazz = Class.forName("com.cjl.pattern.singleton.Singleton11");
            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            Singleton11 singleton11 = (Singleton11) constructor.newInstance(null);

            System.out.println("SingleTest.main  reflect "+singleton11);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

        Singleton11 singleton111 = Singleton11.getInstance();
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE));
            oos.writeObject(singleton111);
            oos.flush();
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE));
            Singleton11 singleton111Copy = (Singleton11) ois.readObject();
            System.out.println("SingleTest.main Serializable "+singleton111Copy);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
