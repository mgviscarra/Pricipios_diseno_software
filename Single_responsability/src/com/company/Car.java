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

    public void start(){
        System.out.println(String.format("Starting %s, %s, %s", brand, model, year));
    }

    public void stop(){
        System.out.println(String.format("Stopping %s, %s, %s", brand, model, year));
    }

    public String getBrand(){
        return  brand;
    }

    public String getModel(){
        return model;
    }

    public String getYear(){
        return year;
    }

}
