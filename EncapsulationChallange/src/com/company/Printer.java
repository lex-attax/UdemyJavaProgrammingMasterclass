package com.company;

public class Printer {
    private int tonerLevel;
    private int numberOfPagesPrinted;
    private boolean duplexPrinter;

    public Printer(int tonerLevel, int numberOfPagesPrinted, boolean duplexPrinter) {
        if(tonerLevel > 100) {
            this.tonerLevel = 100;
        } else {
            this.tonerLevel = tonerLevel;
        }
        this.numberOfPagesPrinted = numberOfPagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public int fillToner(int amount) {
        System.out.println("Toner at " + this.tonerLevel +" %");
        System.out.println("Filling Toner...");
        if(tonerLevel + amount >100) {
            this.tonerLevel = 100;
            System.out.println("Toner at " + this.tonerLevel + "%");
        } else {
            this.tonerLevel += amount;
            System.out.println("Toner at " + this.tonerLevel + "%");
        }
        System.out.println("=========");
        return this.tonerLevel;
    }

    public int printPages(int amount) {
        if(this.duplexPrinter) {
            System.out.println("DuplexPrinter");
        }
        numberOfPagesPrinted +=amount;
        System.out.println("Total amount of pages printed: " + numberOfPagesPrinted);
        System.out.println("=========");
        return numberOfPagesPrinted;
    }

}
