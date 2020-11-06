package com.cjl.algorithm.stack;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * 逆波兰表达式.png
 * reverse Polish notation, RPN
 *
 *
 *
 *
 * 1.数字直接入队列
 * 2.运算符要与栈顶元素比较
 *  ①栈为空直接入栈
 *  ②运算符优先级大于栈顶元素优先级则直接入栈
 *  ③小于或等于则出栈入列，再与栈顶元素进行比较，直到运算符优先级小于栈顶元
 *     素优先级后，操作符再入栈
 * 3.操作符是 ( 则无条件入栈
 * 4.操作符为 )，则依次出栈入列，直到匹配到第一个(为止，此操作符直接舍弃，(直接出栈舍弃
 *
 */
public class RPNStack {
    public static void main(String[] args) {
        String[] src = {"9","+","(","3","-","1",")","*","3","+","10","/","2"};
        String nums = "0123456789";
        String ops = "+-*/";
        String opLow = "+-";
        String opHigh = "*/";

        LinkedList<String> data = new LinkedList<String>();
        Stack<String> op = new Stack<>();
        int i = 1;
        for (String s : src) {
            System.out.println(i++ +"     "+s);
            if (s.equals("(")){
                op.push(s);
            }else if(s.equals(")")){
                while (!op.peek().equals("(")){
                    data.add(op.pop());
                }
                op.pop();
            }else if (ops.contains(s)){//+-*/
                if (op.size() > 0){
                    if (op.peek().equals("(")){
                    }else if (opLow.contains(op.peek()) && opHigh.contains(s)){//  */   +-
                    }else {
                        System.out.println("||   "+op);
                        if (opHigh.contains(op.peek())
                            || (opLow.contains(op.peek()) && opLow.contains(s))){

                            if (!op.empty()){
                                data.add(op.pop());
                            }

                            while (!op.empty() && !((opHigh.contains(s) && opLow.contains(op.peek())) || ( op.peek().equals("(")))){
                                    data.add(op.pop());
                            }

                        }

                    }
                }
                op.push(s);
            }else {//num
                data.add(s);
            }

            System.out.println("data "+data);
            System.out.println("op  "+op);
        }

        while (!op.empty()){
            data.add(op.pop());
        }

        System.out.println(data);

    }
}
