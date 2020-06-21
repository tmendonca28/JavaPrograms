package com.mendonca;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if (number < 6) {
            return false;
        }
        int sumOfProperDivisors = 0;
        for (int i = 1; i<number; i++) {
            if (number%i == 0){
                sumOfProperDivisors += i;
            }
        }
        if (sumOfProperDivisors == number) {
            return true;
        }
        return false;
    }
}
