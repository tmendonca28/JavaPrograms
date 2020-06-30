package com.mendonca;

public class VipCustomer {
    private String customerName;
    private double creditLimit;
    private String emailAddress;


    public VipCustomer() {
        this("Anthony", 5000.0, "me@you.com");
    }

    public VipCustomer(String customerName, double creditLimit) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
    }


    public VipCustomer (String customerName, double creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
