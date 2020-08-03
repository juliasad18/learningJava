package com.burger;

public class Main {
    public static void main(String[] args) {
        Addition tomato = new Addition("tomato", 0.5);
        Addition pickles = new Addition("pickles", 0.25);

        HesBurger hesBurger = new HesBurger("brioche", "chicken", 2);
        hesBurger.setAddition1(tomato);
        hesBurger.setAddition2(pickles);

        System.out.println(hesBurger.totalPrice(hesBurger.getPrice(), hesBurger.getAddition1().getPrice(), hesBurger.getAddition2().getPrice()));
    }
}
