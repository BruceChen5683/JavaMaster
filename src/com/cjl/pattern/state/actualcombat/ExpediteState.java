package com.cjl.pattern.state.actualcombat;

public class ExpediteState implements State{
    @Override
    public void move(Hero hero) {
        System.out.println("ExpediteState.move  加速状态，加速移动");
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        hero.setState(hero.NORMAL_STATE);
        System.out.println("ExpediteState.move 加速状态结束，恢复正常状态");
    }
}
