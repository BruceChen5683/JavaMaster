package com.cjl.pattern.memento.actualcombat;

public class Client {
    public static void main(String[] args) {
        Sys sys = new Sys();
        Player player = new Player();
        sys.setLocation(new Location(10,10));
        player.saveChess(sys.createChess());

        sys.setLocation(new Location(20,20));
        player.reteieveChess();
    }
}
