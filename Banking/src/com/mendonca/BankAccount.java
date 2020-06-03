package com.mendonca;

public class BankAccount {

    private String firstName;
    private String lastName;
    private double balance;

    public BankAccount(String firstName, String lastName, double balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    // branch arg is true if the customer is performing transaction
    // at a branch with a teller
    //  It's false if customer is performing transaction at an ATM
    public double deposit(double amount, boolean branch) {
        balance += amount;
        return balance;
    }

    // branch arg is true if the customer is performing transaction
    // at a branch with a teller
    //  It's false if customer is performing transaction at an ATM
    public double withdraw(double amount, boolean branch) {
        balance -= amount;
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    // More methods that use firstName, lastName and perform other functions

}
