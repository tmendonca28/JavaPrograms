package com.mendonca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 1, sum = 0;

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Enter number #" + count + ":");

            boolean isInt = scanner.hasNextInt();

            if(isInt) {
                int number = scanner.nextInt();
                sum+=number;
                count++;
                if (count == 11){
                    break;
                }
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine();
        }
        System.out.println("The sum is: " + sum);
        scanner.close();
    }
}
