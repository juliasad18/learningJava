package com.vehicle;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        System.out.println("Let's Drive begin!");

        Drive drive = new Drive();

        drive.setCarBrands(new String[] {"Audi", "BMW", "Volkswagen"});
        drive.setCarSteering(new String[] {"Manual", "Automatic"});
        drive.setCarGears(new int[] {5, 6});

        Object[] randomCar = drive.getRandomCar();

        Scanner in = new Scanner(System.in);

        System.out.println("Chosen car model is: " + randomCar[0]);
        System.out.println("The car steering is: " + randomCar[1]);
        System.out.println("The car has " + randomCar[2] + " gears");
        System.out.println("Current gear is: " + drive.getCurrentGear());
        System.out.println("Current speed is: " + drive.getCurrentSpeed());

        while(true) {
            System.out.println("Change the gear: ");
            if (drive.setSwitchingGear(in.nextInt()) == 0) {
                System.out.println("Your drive is over. Thank you for the ride!");
                break;
            }
        }

    }
}
