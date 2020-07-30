package com.room;

public class Application {
    public static void main(String[] args) {
        Wall wall = new Wall("white", 2);
        Furniture table = new Furniture("table", "office table", 1);
        Window window = new Window("square", 1, "white");

        Room officeRoom = new Room(5, wall, window, table, 2);

        System.out.println(officeRoom.getFurniture().getName());
        System.out.println(officeRoom.getWindow().getColour());

    }
}
