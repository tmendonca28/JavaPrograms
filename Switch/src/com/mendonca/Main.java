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

            case 3: case 4: case 4:
                System.out.println("Was a 3 or a 4 or a 5");
                System.out.println("Actually it was a " + switchValue);

            default:
                System.out.println("Was not 1 or 2");
                break;
        }

        // More code here
    }
}
