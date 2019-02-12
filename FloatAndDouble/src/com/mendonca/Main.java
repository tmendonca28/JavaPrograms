package com.mendonca;

public class Main {
    private static final double poundToKilos = 0.45359237;

    public static void main(String[] args) {
	    // Float and Double implementations for decimal numbers
        // int size = 32 (4 bytes)
        int myIntValue = 13 / 2;
        // float size = 32 (4 bytes)
        float myFloatValue = 13f / 2f;
        // double size = 64 (8 bytes)
        // useful for precision; it's faster on modern computers
        double myDoubleValue = 13d / 2d;

        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myIntValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);

        // Converting pounds to kilograms
        double givenPounds = 100d;
        double resultingKilograms = givenPounds * poundToKilos;

        System.out.println(givenPounds + " pounds is " + resultingKilograms + " kgs");

    }
}
