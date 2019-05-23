package com.cjl.io.fun;

public class People {
    private boolean isTrue;
    private String des;
    private String inverseDes;
    private String name;

    public String getInverseDes() {
        return inverseDes;
    }

    public void setInverseDes(String inverseDes) {
        this.inverseDes = inverseDes;
    }

    @Override
    public String toString() {
        return "People{" +
                "isTrue=" + isTrue +
                ", des='" + des + '\'' +
                ", inverseDes='" + inverseDes + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isTrue() {
        return isTrue;
    }

    public void setTrue(boolean aTrue) {
        isTrue = aTrue;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
