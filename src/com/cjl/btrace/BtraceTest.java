 package com.cjl.btrace;
 import java.util.Random;

 /**
  * https://qindongliang.iteye.com/blog/2408834
  */
 public class BtraceTest  {

    public static Random random=new Random();

    public int add (int a, int b)   {
        int sum=a+b;
        System.out.println("sum:"+sum);
        return a+b;
    }

    public void run(){
        int i = 0;
        try {
            while (true) {
                add(random.nextInt(10), random.nextInt(10));
                Thread.sleep(random.nextInt(10) * 1000);
                i++;
                if(i==10){
                    throw new Exception("----e");
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }


    public static void main(String[] args)     {
        new BtraceTest().run();

    }

}
