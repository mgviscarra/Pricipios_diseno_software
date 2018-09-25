package com.company;

public class AllOnePrinter implements Printer, Fax, Scan {
    @Override
    /**
     * Method to faxing
     */
    public void fax() {
        System.out.println("All one printer sending fax");
    }

    /**
     * Method to printing
     */
    @Override
    public void print() {
        System.out.println("All one printer printing");
    }

    /**
     * Method to scanning
     */
    @Override
    public void scan() {
        System.out.println("All one printer scanning");
    }
}
