package com.company;

public class Main {

    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rectangle = new Rectangle(4,6);
        AreaCalculator.calculateArea(circle);
        AreaCalculator.calculateArea(rectangle);
    }
}
