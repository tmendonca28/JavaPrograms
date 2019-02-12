package com.mendonca;

public class Main {

    public static void main(String[] args) {
	    // Data Types
        // int has space of 32
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2_147_483_647;

        // smaller than int; quarter space of an integer i.e 8
        // useful for memory-restricted applications
        byte myByteValue = 10;

        // twice a byte's space; half an int's space i.e 16
        short myShortValue = 32767;

        // long has space of 64
        long myLongValue = 100L;

        byte validByte = 13;
        short validShort = 13000;
        int validInt = 13;
        long result = 50000 + 10*(validByte + validShort + validInt);
        short shortResult = (short) result;

        System.out.println("Result is: " + result);
        System.out.println("Short result is: " + shortResult);

    }
}
