package com.mendonca;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        // year must be 1 =< n =< 9999
        if(year<=1) {
            return false;
        }
        if(year>=9999){
            return false;
        }

        // Check if leap year
        if (year%4==0) {
            return true;
        }
        return false;
    }
}
