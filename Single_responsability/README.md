In this example we are giving an example of single responsability.

All the methods, it means: start, stop, drive, shiftGear, applyBreacks can be inside the Car class
and it would work, but we would be violating the single responsability principle.

The responsability of starting or stopping is part of the car, but the car itself cannot apply the breaks, shift the gear or apply the breaks
so that responsability would be of the Driver class.