package com.mendonca;


public class Main {

    public static void main(String[] args) throws IllegalAccessException {
	// write your code here
        Solution solution = new Solution();
        char[] hello = {'h', 'e', 'l', 'l', 'o'};
        char[] sol1 = solution.reverseString(hello);
        char[] hannah = {'H','a','n','n','a','h'};
        char[] sol2 = solution.reverseString(hannah);
    }
}
