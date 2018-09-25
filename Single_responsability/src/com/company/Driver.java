package com.company;

public class Driver {
    private String driverName;

    public Driver(String driverName){
        this.driverName = driverName;
    }

    /**
     * Method to drive the car
     * @param car
     */
    public void drive(Car car){
        System.out.println(String.format("%s driving %s, %s, %s", driverName, car.getBrand(),
                car.getModel(), car.getYear()));
    }

    /**
     * Method to shift the gear
     * @param car
     */
    public void shiftGear(Car car){
        System.out.println(String.format("%s shifting the gear of %s, %s, %s", driverName, car.getBrand(),
                car.getModel(), car.getYear()));
    }

    /**
     * Method to apply the breaks
     * @param car
     */
    public void applyBreaks(Car car){
        System.out.println(String.format("%s applying brakes to %s, %s, %s", driverName, car.getBrand(),
                car.getModel(), car.getYear()));
    }
}
