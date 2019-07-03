package com.cjl.pattern.memento.actualcombat;

public class Chess {
    private Location location;

    public Chess(Location location){
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }


}
