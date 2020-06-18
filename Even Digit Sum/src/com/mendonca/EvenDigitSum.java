package com.mendonca;

public class EvenDigitSum {
    public static int getEvenDigitSum (int number) {
        // Sanity check
        if (number < 0) {
            return -1;
        }
        int sum = 0;

        while (number != 0) {
            int current = number%10;
            if (current%2 == 0){
                sum += current;
            }
            number = number/10;
        }
        return sum;
    }
}
