package com.cjl.pattern.singleton;

public class InstanceLazy {
    private Integer value;
    private Integer val;//可能很打  如巨型数组1000000

    public InstanceLazy(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    private static class ValHolder{
        public static Integer vHolder = new Integer(100000);
    }

    public Integer getVal() {
        return ValHolder.vHolder;
    }

}
