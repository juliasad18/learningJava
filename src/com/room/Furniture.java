package com.room;

public class Furniture {
    private String name;
    private String purpose;
    private int size;

    public Furniture(String name, String purpose, int size) {
        this.name = name;
        this.purpose = purpose;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getPurpose() {
        return purpose;
    }

    public int getSize() {
        return size;
    }
}
