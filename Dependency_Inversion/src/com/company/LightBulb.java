package com.company;

public class LightBulb implements Switchable {
    @Override
    public void turnSwitchOn() {
        System.out.println("LightBulb: Bulb turned on...");
    }

    @Override
    public void turnSwitchOff() {
        System.out.println("LightBulb: Bulb turned off...");
    }
}
