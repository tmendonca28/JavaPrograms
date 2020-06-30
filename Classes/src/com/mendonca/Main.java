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

        System.out.println("VIP Customer Constructor");
        VipCustomer customer1 = new VipCustomer();
        System.out.println("Customer1 is : " + customer1.getCustomerName());

        VipCustomer customer2 = new VipCustomer("JayJay", 50000.0);
        System.out.println("Customer2 is : " + customer2.getCustomerName());

        VipCustomer customer3 = new VipCustomer("Juliet", 800000.0, "J@m.com");
        System.out.println("Customer3 is : " + customer3.getCustomerName());
    }
}
