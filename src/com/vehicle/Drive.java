package com.vehicle;

public class Drive extends CarModel {
    private int switchingGear;

    public Drive() {
        super();
        this.switchingGear = 0;
    }

    public int getSwitchingGear() {
        return switchingGear;
    }


    public int setSwitchingGear(int switchingGear) {
        int driveStatus = 1;
        if (switchingGear - super.getCurrentGear() == 1) {
            System.out.println("Switching gear higher by 1...");
            driveStatus = super.switchGear(switchingGear);
        } else if (super.getCurrentGear() - switchingGear == 1) {
            System.out.println("Switching gear lower by 1...");
            driveStatus = super.switchGear(switchingGear);
        } else if (switchingGear == super.getCurrentGear()) {
            System.out.println("Nothing changed.");
        } else {
            System.out.println("Choosen gear is too high or too low to be switched.");
        }
        return driveStatus;
    }



}
