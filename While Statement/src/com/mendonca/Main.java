package com.mendonca;

public class Main {

    public static void main(String[] args) {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        int number = 4;
        int finishNumber = 20;

        while (number <= finishNumber) {
            number++;
            if (!EvenNumber.isEvenNumber(number)){
                continue;
            }
            System.out.println("Even number " + number);
        }
    }
}
