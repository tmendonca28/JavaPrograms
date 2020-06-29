package com.mendonca;

public class Main {

    public static void main(String[] args) {
        Car bmw = new Car();
        Car toyota = new Car();

        bmw.setModel("m3");
        System.out.println("Model is " + bmw.getModel());
    }
}
