package com.mendonca;

public class MinutesToYearsDaysCalculator {
    public static void printYearsAndDays(long minutes) {
        // Calculate years and days from minutes
        // Sanity check
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        long years = minutes / 525600;
        long days = (minutes % 525600) / (60 * 24);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
    }
}
