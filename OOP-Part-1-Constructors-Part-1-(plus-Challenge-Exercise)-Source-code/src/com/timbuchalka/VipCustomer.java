package com.timbuchalka;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAdress;

    public VipCustomer(){
        this.name = "default";
        this.creditLimit = 10.00;
        this.emailAdress = "default@default.com";
    }

    public VipCustomer(String name, double creditLimit) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = "default";

    }

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
