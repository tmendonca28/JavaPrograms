package com.mendonca;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
        int yearOfBirth = scanner.nextInt();
        scanner.nextLine(); // handles next line character (enter key)

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        int age = 2020 - yearOfBirth;
        System.out.println("Your name is " + name);
        System.out.println("You were born in " + yearOfBirth + " and your age is " + age);
        // Close the scanner
        scanner.close();
    }
}
