package com.mendonca;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        for (int number = 1, count = 0; number <= 1000 && count < 5; number++) {
            if ((number%15 ==0)) {
                System.out.println(number);
                sum += number;
                count++;
            }
        }
        System.out.println("Sum is " + sum);
    }
}
