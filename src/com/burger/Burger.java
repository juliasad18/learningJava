package com.burger;

public class Burger {
    private String breadRollType;
    private String meat;
    private double price;

    public Burger(String breadRollType, String meat, double price) {
        this.breadRollType = breadRollType;
        this.meat = meat;
        this.price = price;
    }

    public String getBreadRollType() {
        return breadRollType;
    }

    public String getMeat() {
        return meat;
    }

    public double getPrice() {
        return price;
    }

    public double totalPrice() {
        return price;
    }
}
