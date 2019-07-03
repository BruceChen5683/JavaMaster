package com.cjl.pattern.composite2.actualcombat;

public class SmallTeam extends Team{
    private String name;

    public SmallTeam(String name){
        this.name = name;
    }
    @Override
    public void print(String string) {
        System.out.println("**********"+ name + "   " +string);
    }
}
