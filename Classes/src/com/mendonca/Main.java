package com.mendonca;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car toyota = new Car();

        bmw.setModel("m3");
        System.out.println("Model is " + bmw.getModel());

        BankAccount anthonysAccount = new BankAccount(
                "12345",
                0.00,
                "mymail@anthony.com",
                "Anthony Positano",
                "3413423424");

        System.out.println(anthonysAccount.getCustomerName());
        System.out.println(anthonysAccount.getBalance());
        anthonysAccount.withdrawal(100.0);

        anthonysAccount.deposit(50.0);
        anthonysAccount.withdrawal(100.0);

        anthonysAccount.deposit(51.0);
        anthonysAccount.withdrawal(100.0);
    }
}
