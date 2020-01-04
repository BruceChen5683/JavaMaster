package com.cjl.algorithm.datastructure;

public class ClientStack {
    public static void main(String[] args) {
        CStackImpl cStack = new CStackImpl();

        cStack.push("a");
        cStack.push("b");
        cStack.push("a");
        cStack.push("c");

        while (!cStack.isEmpty()){
            System.out.println("ClientStack.main "+cStack.pull());
        }
    }
}
