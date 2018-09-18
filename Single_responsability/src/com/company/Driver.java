package com.company;

public class Driver {
    private String driverName;

    public Driver(String driverName){
        this.driverName = driverName;
    }

    public void drive(Car car){
        System.out.println(String.format("%s driving %s, %s, %s", driverName, car.getBrand(),
                car.getModel(), car.getYear()));
    }

    public void shiftGear(Car car){
        System.out.println(String.format("%s shifting the gear of %s, %s, %s", driverName, car.getBrand(),
                car.getModel(), car.getYear()));
    }

    public void applyBreaks(Car car){
        System.out.println(String.format("%s applying brakes to %s, %s, %s", driverName, car.getBrand(),
                car.getModel(), car.getYear()));
    }
}
