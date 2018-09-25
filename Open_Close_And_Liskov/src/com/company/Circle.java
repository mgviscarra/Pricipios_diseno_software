package com.company;

public class Circle implements  Shape {

    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    /**
     * Calculates the circle area
     * @return the calculated area
     */
    @Override
    public double calculateArea() {
        return Math.PI*radius*radius;
    }
}
