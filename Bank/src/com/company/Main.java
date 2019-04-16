package com.company;

public class Main {

    public static void main(String[] args) {

    BankAccount bobsAccount = new Account("12345", 0.00, "Bob Brown", "email", 0123);

    BankAccount test = new BankAccount();
    test.setBalance(10.10);
        System.out.println("test balance is: " + test.getBalance());

    test.deposit(100);
        System.out.println("test balance is: " + test.getBalance());

    test.withdraw(-10);
        System.out.println("test balance is: " + test.getBalance());
    }
}
