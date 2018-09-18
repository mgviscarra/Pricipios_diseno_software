package com.company;

public class AllOnePrinter implements Printer, Fax, Scan {
    @Override
    public void fax() {
        System.out.println("All one printer sending fax");
    }

    @Override
    public void print() {
        System.out.println("All one printer printing");
    }

    @Override
    public void scan() {
        System.out.println("All one printer scanning");
    }
}
