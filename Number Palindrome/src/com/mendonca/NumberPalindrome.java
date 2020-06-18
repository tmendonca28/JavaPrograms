package com.mendonca;

public class NumberPalindrome {
    public static boolean isPalindrome (int number) {
        int originalNumber = number, remainder;

        int reverse = 0;
        while (number != 0) {
            remainder = number%10;
            reverse = reverse*10 + remainder;
            number /= 10;
        }

        if (originalNumber == reverse) {
            return true;
        }
        return false;
    }
}
