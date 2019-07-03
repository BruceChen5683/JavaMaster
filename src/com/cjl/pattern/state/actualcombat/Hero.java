package com.cjl.pattern.state.actualcombat;

public class Hero {
    /**
     * 正常状态
     */
    public static final State NORMAL_STATE = new NormalState();
    /**
     * 加速状态
     */
    public static final State EXPEDITE_STATE = new ExpediteState();
    /**
     * 减速状态
     */
    public static final State DECELERATE_STATE = new DecelerateState();
    /**
     * 眩晕状态
     */
    public static final State DIZZINESS_STATE = new DizzinessState();

    //保存英雄当前状态，默认是正常状态
    private State state = NORMAL_STATE;

    private Thread moveThread;

    public void startMove(){
        if(isMoving()){
            return;
        }

        final Hero hero = this;
        moveThread = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!moveThread.isInterrupted()){
                    state.move(hero);
                }
            }
        });
        System.out.println("Hero.startMove");
        moveThread.start();
    }

    public void stopMove(){
        if(isMoving()){
            moveThread.interrupt();
        }
        System.out.println("Hero.stopMove");

    }

    public boolean isMoving(){
        return moveThread != null && !moveThread.isInterrupted();
    }

    public void setState(State state){
        this.state = state;
    }

}
