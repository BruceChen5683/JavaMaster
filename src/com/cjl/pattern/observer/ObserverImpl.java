package com.cjl.pattern.observer;

import java.lang.reflect.Field;
import java.util.Observable;
import java.util.Observer;
import java.util.Vector;

/**
 * Created by chenjianliang on 2017/5/18.
 */
public class ObserverImpl implements Observer{

    @Override
    public void update(Observable o, Object arg) {

        try {
            if(getObserver(o) != this){
                System.out.println("arg = " + arg);
            }else {
                int i = (int)arg;
                if(i <= 5){
                    System.out.println("arg = " + arg);
                }
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }


    private Observer getObserver(Observable observable) throws NoSuchFieldException, IllegalAccessException {
        Class<?> classType = Observable.class;
        Field field = classType.getDeclaredField("obs");
        field.setAccessible(true);
        Vector<Observer> observers =  (Vector<Observer>) field.get(observable);

        return observers.get(1);
    }
}
