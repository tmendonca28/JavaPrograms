package com.mendonca;

public class SumOddRange {
    public static boolean isOdd(int number) {
        if (number < 0) {
            return false;
        }
        if (number % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumOdd (int start, int end) {
        // Sanity Checks
        if (end < start) {
            return -1;
        }
        if ((start < 0) || (end < 0)) {
            return -1;
        }
        int sum = 0;
        for (int count = start; count <= end; count++) {
            if (isOdd(count)) {
                sum += count;
            }
        }
        return sum;
    }
}
