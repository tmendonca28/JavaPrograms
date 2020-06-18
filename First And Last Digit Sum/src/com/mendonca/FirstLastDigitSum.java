package com.mendonca;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit (int number) {
        if (number < 0) {
            return -1;
        }
        int first_digit = number;
        while (first_digit >= 10) {
            first_digit = first_digit / 10;
        }
        int last_digit = number % 10;
        return first_digit+last_digit;
    }
}
