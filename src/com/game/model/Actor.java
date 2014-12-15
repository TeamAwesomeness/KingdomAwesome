package com.game.model;

import java.awt.Point;
import java.io.Serializable;

public class Actor implements Serializable {
    
    Mystical_Hero("Hero that saves the land.");
    
    private final String description;
    private final Point coordinates;
    
    Actor(String description) {
        this.description = description;
        coordinates = new Point(1,1);
    }
    
    public String getDescription(){
        return description;
    }
    
    public Point getCoordinates(){
        return coordinates;
    }
    
}
