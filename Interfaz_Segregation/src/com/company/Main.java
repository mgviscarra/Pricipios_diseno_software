package com.company;

public class Main {

    public static void main(String[] args) {
        EconomicPrinter economicPrinter = new EconomicPrinter();
        economicPrinter.print();
        AllOnePrinter allOnePrinter = new AllOnePrinter();
        allOnePrinter.print();
        allOnePrinter.fax();
        allOnePrinter.scan();
    }
}
