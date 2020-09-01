package com.mendonca;

public class Main {

    public static void main(String[] args) {
        System.out.println(reversedWords("the sky is blue"));
        int[] arrayw = new int{4, 9, 10};
        System.out.println(sortIntegers(arrayw));
    }

    public static String reversedWords(String s) {
        String[] arr = s.split(" ");
        System.out.println(arr);
        return s;
    }

    public static int[] sortIntegers(int[] array) {
        int[] sortedArray = new int[array.length];

        for (int i =0; i<array.length; i++){
            sortedArray[i] = array[i];
        }

        boolean flag = true;
        int temp;

        while(flag) {
            flag = false;

            for (int i =0; i<sortedArray.length-1; i++) {
                if (sortedArray[i] < sortedArray[i + 1]) {
                    temp  = sortedArray[i];
                    sortedArray[i] = sortedArray[i+1];
                    sortedArray[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sortedArray;
    }
}
