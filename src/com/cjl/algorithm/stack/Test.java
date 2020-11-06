package com.cjl.algorithm.stack;

public class Test {
    public static void main(String[] args) {
        LinkedListStack<String> linkedListStack = new LinkedListStack<>();

        linkedListStack.push("1");
        linkedListStack.push("2");
        linkedListStack.push("3");
        linkedListStack.push("1");

        System.out.println(linkedListStack.peek());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());
        System.out.println(linkedListStack.pop());



    }
}
