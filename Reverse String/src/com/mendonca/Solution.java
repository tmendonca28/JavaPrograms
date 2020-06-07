package com.mendonca;

/**
 *
 */
public class Solution {
    public char[] reverseString(char[] s) throws IllegalAccessException {
        // Sanity check
        if(s.length == 0){
            throw new IllegalAccessException("Empty input");
        }

        int start = 0;
        int end = s.length - 1;
        char temp;

        for (; end > start; start++, end--) {
            temp = s[start];
            s[start] = s[end];
            s[end] = temp;
        }

        return s;

    }
}
