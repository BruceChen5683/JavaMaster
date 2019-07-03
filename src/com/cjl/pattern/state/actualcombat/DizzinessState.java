package com.cjl.pattern.state.actualcombat;

public class DizzinessState implements State{
    @Override
    public void move(Hero hero) {
        System.out.println("DizzinessState.move  眩晕状态，停止移动");
        try {
            Thread.sleep(1500);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        hero.setState(hero.NORMAL_STATE);
        System.out.println("DizzinessState.move 眩晕状态结束，恢复正常状态");

    }
}
