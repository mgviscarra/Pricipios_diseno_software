"The interface-segregation principle (ISP) states that no client should be forced to depend on methods it does not use."

In the example we can have an interface thaPrinterDevice that defines the methods print, fax and scan.

We can implement this interface in AllOnePrinter and Economic Printer, but economic printer do not need the fax and scan methods, since it will have just the 
ability of printing. so those methods will not be used.

So creating different interfaces, we implement in allOnePrinter and EconomicPrinter only the interfaces that have the methods that they will use, and they will no depend on methods
that are not needed.