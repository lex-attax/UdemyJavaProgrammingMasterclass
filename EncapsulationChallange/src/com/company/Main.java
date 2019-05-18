package com.company;

public class Main {

    public static void main(String[] args) {
    Printer duplexPrinter = new Printer(50, 0, true);
    duplexPrinter.printPages(1);

    Printer noDuplexPrinter = new Printer(80,100,false);
    noDuplexPrinter.fillToner(10);
    }


}
