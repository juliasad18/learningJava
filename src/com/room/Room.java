package com.room;

public class Room {
    private int size;
    private Wall wall;
    private Window window;
    private Furniture furniture;
    private int windowCount;

    public Room(int size, Wall wall, Window window, Furniture furniture, int windowCount) {
        this.size = size;
        this.wall = wall;
        this.window = window;
        this.furniture = furniture;
        this.windowCount = windowCount;
    }

    public int getSize() {
        return size;
    }

    public Wall getWall() {
        return wall;
    }

    public Window getWindow() {
        return window;
    }

    public Furniture getFurniture() {
        return furniture;
    }

    public int getWindowCount() {
        return windowCount;
    }
}
