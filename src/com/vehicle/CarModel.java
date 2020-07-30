package com.vehicle;

import java.util.Random;

public class CarModel extends Car {
    private String[] carBrands;
    private String[] carSteering;
    private int[] carGears;

    public CarModel() {
    }

    public String[] getCarBrands() {
        return carBrands;
    }

    public String[] getCarSteering() {
        return carSteering;
    }

    public int[] getCarGears() {
        return carGears;
    }

    public void setCarBrands(String[] carBrands) {
        this.carBrands = carBrands;
    }

    public void setCarSteering(String[] carSteering) {
        this.carSteering = carSteering;
    }

    public void setCarGears(int[] carGears) {
        this.carGears = carGears;
    }

    public Object[] getRandomCar() {
        Random random = new Random();
        super.setBrand(carBrands[random.nextInt(3)]);
        super.setSteering(carSteering[random.nextInt(2)]);
        super.setGears(carGears[random.nextInt(2)]);
        return new Object[] {super.getBrand(), super.getSteering(), super.getGears()};
    }
}
