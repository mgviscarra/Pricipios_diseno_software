package com.company;

public class ElectricPowerSwitch implements Switch {
    public Switcheable client;
    public boolean on;

    public ElectricPowerSwitch(Switcheable client){
        this.client=client;
        this.on = false;
    }
    @Override
    public boolean isOn() {
        return this.on;
    }

    @Override
    public void press() {
        boolean checkOn = isOn();
        if(checkOn){
            client.turnOff();
            this.on = false;
        } else{
            client.turnOn();
            this.on = true;
        }
    }
}
