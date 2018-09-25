package com.company;

public class Main {

    public static void main(String[] args) {
        Switchable fan = new Fan();
        Switch fanSwitch = new ElectricPowerSwitch(fan);
        fanSwitch.pressSwitch();
        fanSwitch.pressSwitch();

        Switchable bulb = new LightBulb();
        Switch bulbSwitch = new ElectricPowerSwitch(bulb);
        bulbSwitch.pressSwitch();
        bulbSwitch.pressSwitch();
    }
}
