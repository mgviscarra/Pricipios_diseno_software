package com.company;

public class ElectricPowerSwitch implements Switch {
    public Switchable client;
    public boolean isSwitchOn;

    public ElectricPowerSwitch(Switchable client){
        this.client=client;
        this.isSwitchOn = false;
    }

    /**
     * Verifies if the switch is on or off
     * @return true or false
     */
    @Override
    public boolean isSwitchOn() {
        return this.isSwitchOn;
    }

    /**
     * Presses the switch to turn on or off
     */
    @Override
    public void pressSwitch() {
        boolean checkOn = isSwitchOn();
        if(checkOn){
            client.turnSwitchOff();
            this.isSwitchOn = false;
        } else{
            client.turnSwitchOn();
            this.isSwitchOn = true;
        }
    }
}
