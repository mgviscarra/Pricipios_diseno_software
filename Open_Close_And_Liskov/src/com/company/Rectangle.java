package com.company;

public class Rectangle implements Shape {

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    /**
     * Calculates the rectangle area
     * @return the calculated area
     */
    @Override
    public double calculateArea() {
        return length *width;
    }
}
