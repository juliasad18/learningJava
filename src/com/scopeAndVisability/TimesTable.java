package com.scopeAndVisability;

import java.util.Scanner;

public class TimesTable {
    private int x;

    public TimesTable(Scanner x) {
        System.out.println("Enter number...");
        this.x = x.nextInt();
    }


    public int getX() {
        return x;
    }

    public int tomesNumber() {
        this.x = x * 2;
        return this.x;
    }

}
