package com.mendonca;

public class Main {

    public static void main(String[] args) {
        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // Creating a switch statement with char var
        char switchChar = 'E';

        switch (switchChar) {
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("Found " + switchChar);
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
