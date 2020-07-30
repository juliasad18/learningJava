package com.vehicle;

public class Car extends Vehicle {
    private String brand;
    private String steering;
    private int gears;
    private int currentGear;
    private int currentSpeed;


    public Car(String name, String color, String brand, String steering, int gears) {
        super(name, color);
        this.brand = brand;
        this.steering = steering;
        if (gears < 1) {
            this.gears = 1;
        } else if (gears > 6) {
            this.gears = 6;
        } else {
            this.gears = gears;
        }
        this.currentSpeed = 0;
        this.currentGear = 0;
    }

    public Car() {
        super();
    }

    public int getGears() {
        return gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public String getBrand() {
        return brand;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public String getSteering() {
        return steering;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setSteering(String steering) {
        this.steering = steering;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
        System.out.println("Speed was changed and equal to " + currentSpeed + "now.");
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int switchGear(int gears) {
        int driveStatus = 1;
        if (gears <= this.gears && gears != 0) {
            if (gears > getCurrentGear()) {
                setCurrentGear(gears);
                setCurrentSpeed(getCurrentSpeed() + 10);
                System.out.println("The current gear is: " + getCurrentGear());
            } else if (gears < getCurrentGear()) {
                setCurrentGear(gears);
                setCurrentSpeed(getCurrentSpeed() - 10);
                System.out.println("The current gear is: " + getCurrentGear());
            }
        } else if (gears == 0) {
            driveStatus = super.stop();
            System.out.println("The car is stopped");
        } else {
            driveStatus = super.stop();
            System.out.println("Ups! Car is broken :( ");
        }
        return driveStatus;
    }
}
