package com.mendonca;

public class Main {

    public static void main(String[] args) {
        System.out.println(EvenDigitSum.getEvenDigitSum(123456789));
        System.out.println(EvenDigitSum.getEvenDigitSum(252));
        System.out.println(EvenDigitSum.getEvenDigitSum(-22));

        System.out.println();
        System.out.println(SharedDigit.hasSharedDigit(12, 13));
        System.out.println(SharedDigit.hasSharedDigit(9, 99));
        System.out.println(SharedDigit.hasSharedDigit(15, 55));
        System.out.println(SharedDigit.hasSharedDigit(34, 56));
    }
}
