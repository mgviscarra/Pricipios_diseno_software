package com.company;

public class AreaCalculator {
    public static void calculate(Shape shape){
        System.out.println(String.format("The area of the %s, is: %s", shape.getClass().getSimpleName(), shape.calculateArea()));
    }
}
