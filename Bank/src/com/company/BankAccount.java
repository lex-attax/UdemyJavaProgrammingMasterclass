package com.company;

public class BankAccount {
    private int accountNumber = 0;
    private double balance = 0.0;
    private String customerName = null;
    private String email = null;
    private int phoneNumber = 0;

    public void setBalance(double balance){
    this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }
    public void deposit(double amount){
        if(amount >=0) {
            this.balance += amount;
        } else {

        }
    }
    public void withdraw(double amount){
        if(this.balance >= amount) {
            this.balance -= amount;
        } else if(amount < 0) {
            System.out.println("Error: amount should not be negative");
        } else {
            System.out.println("Withdraw not possible, not enough balance ");
        }
    }
}
