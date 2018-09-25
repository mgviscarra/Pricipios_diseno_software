package com.company;

public class Fan implements Switchable {
    @Override
    public void turnSwitchOn() {
        System.out.println("Fan: Fan turned on...");
    }

    @Override
    public void turnSwitchOff() {
        System.out.println("Fan: Fan turned off...");
    }
}
