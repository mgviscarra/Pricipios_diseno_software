package com.company;

public class AreaCalculator {
    /**
     * Given a shape, it calculates its area
     * @param shape
     */
    public static void calculateArea(Shape shape){
        System.out.println(String.format("The area of the %s, is: %s", shape.getClass().getSimpleName(),
                shape.calculateArea()));
    }
}
