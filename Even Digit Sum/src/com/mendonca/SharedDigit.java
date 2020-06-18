package com.mendonca;

public class SharedDigit {
    public static boolean hasSharedDigit (int num1, int num2) {
        if (((num1 < 10) || (num1 > 99)) || ((num2 < 10) || (num2 > 99))) {
            return false;
        }
        while (num1 != 0) {
            int currentDigitNum1 = num1%10;
            int number2 = num2;
            while (number2 != 0) {
                int currentDigitNum2 = number2%10;
                if (currentDigitNum1 == currentDigitNum2) {
                    return true;
                }
                number2 = number2/10;
            }
            num1 = num1/10;
        }
        return false;
    }
}
