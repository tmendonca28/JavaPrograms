package com.mendonca;

public class Main {

    public static void main(String[] args) {
	    int result = 1 + 2;

	    int previousResult = result;
	    result = result - 1;
        System.out.println(result);
        System.out.println(previousResult);

        boolean isAlien = false;
        if (isAlien){
            System.out.println("It is not an alien!");
        }

        int newValue = 51;
        if (newValue == 50) {
            System.out.println("This is true");
        } else {
            System.out.println("This is false");
        }

        boolean isCar = false;

        // ternary
        boolean wasCar = isCar ? true : false;
        if(wasCar){
            System.out.println("wasCar is true");
        } else {
            System.out.println("wasCar is false");
        }

        double myDouble = 20;
        double mySecondDouble = 80;
        double sum = (myDouble + mySecondDouble) * 25;
        if (sum%40 <= 20) {
            System.out.println("Total was over the limit");
        }

    }
}
