package com.company;

public class Car {

    private String brand;
    private String model;
    private String year;

    public Car(String brand, String model, String year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    /**
     * Starts the car
     */
    public void start(){
        System.out.println(String.format("Starting %s, %s, %s", brand, model, year));
    }

    /**
     * Stops the car
     */
    public void stop(){
        System.out.println(String.format("Stopping %s, %s, %s", brand, model, year));
    }

    /**
     * Gets the brand property
     * @return String
     */
    public String getBrand(){
        return  brand;
    }

    /**
     * Gets the model property
     * @return String
     */
    public String getModel(){
        return model;
    }

    /**
     * Gets the year property
     * @return String
     */
    public String getYear(){
        return year;
    }

}
