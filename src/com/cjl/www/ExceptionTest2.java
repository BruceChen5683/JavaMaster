package com.cjl.www;

public class ExceptionTest2 {

    /**
     *
     * try中有System.exit，不执行finally中代码块
     *
     */
    public static void main(String[] args) {

        try {
            String s = null;
            return;

//            System.exit(0);

        }catch (Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("finally");
        }
    }
}
