Dependency Inversion Principle

A. High-level modules should not depend on low-level modules. Both should depend on abstractions.
B. Abstractions should not depend on details. Details should depend on abstractions.

The example is about an electric switch that turns a light bulb on or off

We can have in the ElectricPowerSwith a reference of LightBulb class, and we can turn on and off it, but in this case a high level class would debend on a low level class,
and also we would not be able to power on and off othe kind of devices, so implementing an interface Switcheable, we do not depend on a low level class and it will allow us
to manage other kind of low level class, like the Fan class in this case without having to modify the ElectricPowerSwitch to be able to add a new type in this case "Fan" 