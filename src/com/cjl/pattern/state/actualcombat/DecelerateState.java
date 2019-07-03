package com.cjl.pattern.state.actualcombat;

public class DecelerateState implements State{
    @Override
    public void move(Hero hero) {
        System.out.println("DecelerateState.move  减速状态，减速移动");
        try {
            Thread.sleep(2500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        hero.setState(hero.NORMAL_STATE);
        System.out.println("DecelerateState.move减速状态结束，恢复正常状态");

    }
}
