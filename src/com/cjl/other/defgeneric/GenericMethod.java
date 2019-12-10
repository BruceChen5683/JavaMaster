package com.cjl.other.defgeneric;

public class GenericMethod {
    /**
     * 泛型方法  <T>
     * @param a
     * @param <T>
     * @return
     */
    public <T> T genericMethod(T...a){
        return a[a.length/2];
    }

    public static void main(String[] args) {
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.genericMethod("a","b");
        genericMethod.<Integer>genericMethod(1, 2,3);
    }
}
