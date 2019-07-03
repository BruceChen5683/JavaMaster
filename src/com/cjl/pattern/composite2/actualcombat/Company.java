package com.cjl.pattern.composite2.actualcombat;

import java.util.ArrayList;
import java.util.List;

public class Company extends Team{
    private List<Team> teamList = new ArrayList<>();
    private String name;
    public Company(String name){
        this.name = name;
    }
    @Override
    public void print(String string) {
        if(this.teamList != null){
            System.out.print("*****");
        }
        System.out.println(""+ name + string);
        if(this.teamList != null){
            for (Team team:teamList){
                if(team instanceof Company){
                    System.out.print("*****");
                }
                team.print(string);
            }
        }
    }

    @Override
    public void add(Team team) {
        teamList.add(team);
    }

    @Override
    public void remove(Team team) {
        teamList.remove(team);
    }

    @Override
    public List<Team> getAll() {
        return teamList;
    }
}
