package com.cjl.io.fun;

public class Fun {
    public static void main(String[] args) {

        int sum = 0;//真话人数
        int tempSum = 0;
        int flag = 0;
        char donortor;

        for (sum = 0;sum<=4;sum++){
            for (int i=0;i < 4;i++){
                donortor = (char) ('A'+i);
                if (donortor != 'A'){
                    tempSum += 1;
                }else{
                    tempSum -= 1;
                }
                if (donortor == 'D'){
                    tempSum += 1;
                }else{
                    tempSum -= 1;
                }
                if (donortor != 'D'){
                    tempSum += 1;
                }else{
                    tempSum -= 1;
                }

                if (tempSum == sum){
                    flag = 1;
                    System.out.println("Fun.main sum "+sum);
                    System.out.println("Fun.main  donortor:"+ donortor);
                }
            }
        }



    }
}
