package com.cjl.multi_thread.old;

/**
 * Created by chenjianliang on 2017/5/27.
 */
public class FetchMoney {


    public static void main(String[] args) {
        Bank bank = new Bank();
        Thread threadBankA = new ThreadBank(bank);
        Thread threadBankB = new ThreadBank(bank);
        threadBankA.start();
        threadBankB.start();
    }

}

class Bank{
    private int money = 1000;
    public int getMoney(int number){
        if(number < 0){
            return -1;
        }else if(number > money){
            return -2;
        }else if(money < 0){
            return -3;
        }else {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            money -= number;

            return number;
        }
    }
}

class ThreadBank extends Thread{

    private Bank bank;
    public ThreadBank(Bank bank){
        this.bank = bank;
    }
    @Override
    public void run() {
            System.out.println(        bank.getMoney(800));
    }

}

