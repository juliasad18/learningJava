package com.scopeAndVisability;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean option = true;
        while(option) {
            TimesTable timesTable = new TimesTable(new Scanner(System.in));
            System.out.println(timesTable.getX() + " * 2 = " + timesTable.tomesNumber());
        }



    }
}
