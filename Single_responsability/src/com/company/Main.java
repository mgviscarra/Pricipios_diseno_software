package com.company;

public class Main {

    public static void main(String[] args) {
        Car myCar = new Car("Susuki", "Grand Vitara", "2018");
        Driver me = new Driver("Mauricio");

        myCar.start();
        me.drive(myCar);
        me.shiftGear(myCar);
        me.applyBreaks(myCar);
        myCar.stop();
    }
}
