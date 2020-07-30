package com.wall;

import com.bank.BankAccount;
import com.bank.VipCustomer;

public class Application {
    public static void main(String[] args) {

        System.out.println("____________________________________________________________");
        System.out.println(" ");
        Wall wall = new Wall(5, 4);

        System.out.println(wall.getArea());

        wall.setHeight(-1.5);
        System.out.println(wall.getWidth());
        System.out.println(wall.getHeight());
        System.out.println(wall.getArea());

        Wall wall2 = new Wall(-1.5, 2);
        System.out.println(wall2.getWidth());
        System.out.println(wall2.getHeight());
        System.out.println(wall2.getArea());

        Wall wall3 = new Wall(1.5, 2);
        System.out.println(wall3.getWidth());
        System.out.println(wall3.getHeight());
        System.out.println(wall3.getArea());

    }
}
