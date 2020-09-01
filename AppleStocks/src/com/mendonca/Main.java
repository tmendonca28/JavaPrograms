package com.mendonca;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int[] stockPrices = new int [] {10, 7, 5, 8, 11, 9};

        System.out.println(getMaxProfit(stockPrices));
    }

    // Brute Force approach
    public static int getMaxProfit(int[] prices) {
        int maxProfit = 0;

        for (int outerTime = 0; outerTime < prices.length; outerTime++) {
            for (int innerTime = 0; innerTime < prices.length; innerTime++) {

            }
        }
    }
}
