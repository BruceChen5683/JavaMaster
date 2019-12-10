package com.cjl.other.defgeneric;

public class NormalGeneric<T> {
    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public static void main(String[] args) {
        NormalGeneric<String> normalGeneric = new NormalGeneric<>();
        normalGeneric.setData("data");
        System.out.printf(normalGeneric.getData());
    }
}
