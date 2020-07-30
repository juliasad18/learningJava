package com.room;

public class Window {
    private String shape;
    private int size;
    private String colour;

    public Window(String shape, int size, String colour) {
        this.shape = shape;
        this.size = size;
        this.colour = colour;
    }

    public String getShape() {
        return shape;
    }

    public int getSize() {
        return size;
    }

    public String getColour() {
        return colour;
    }
}
