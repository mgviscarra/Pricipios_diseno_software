In this example we can see the Open closed principle.
The written code should be open to extension, but closed to modifications.

The logic of calculate the area given a shape could be in the Area Calculator class and we could have a switch statement
that depending of the given shape we could do the necessary operations to get the area and display, but what happens if we want to add a new 
shape like square, we wold have to add a new case statement in the switch and modify that method.

In this approach we just have to add the new obect and implemet the interface that defines the method calculateArea, and the AreaCalculator class
will not be changed.