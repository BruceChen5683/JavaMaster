package com.cjl.pattern.memento.actualcombat;


public class Sys {
    private Location location;

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void retract(Chess chess){
        this.location = chess.getLocation();
    }

    public Chess createChess(){
        return new Chess(location);
    }
}
