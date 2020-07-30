package com.room;

public class Wall {
    private String colour;
    private double height;

    public Wall(String colour, double height) {
        this.colour = colour;
        this.height = height;
    }

    public String getColour() {
        return colour;
    }

    public double getHeight() {
        return height;
    }
}
