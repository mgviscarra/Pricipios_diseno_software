package com.company;

public class Main {

    public static void main(String[] args) {
        Switcheable fan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(fan);
        fanSwitch.press();
        fanSwitch.press();

        Switcheable bulb = new LightBulb();
        Switch bulbSwitch = new ElectricPowerSwitch(bulb);
        bulbSwitch.press();
        bulbSwitch.press();
    }
}
