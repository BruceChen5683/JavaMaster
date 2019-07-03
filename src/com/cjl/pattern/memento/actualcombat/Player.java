package com.cjl.pattern.memento.actualcombat;

public class Player {
    private Chess chess;
    public Chess reteieveChess(){
        System.out.println("Player.reteieveChess "+ chess.getLocation().getX()+"------"+chess.getLocation().getY());
        return chess;
    }
    public void saveChess(Chess chess){
        this.chess = chess;
    }
}
