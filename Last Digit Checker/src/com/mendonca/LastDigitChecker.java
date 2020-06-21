package com.mendonca;

public class LastDigitChecker {
    public static boolean hasSameLastDigit (int num1, int num2, int num3) {
        if (((num1>=10) && (num1<=1000)) && ((num2>=10) && (num2<=1000)) && ((num3>=10) && (num3<=1000))){
            int rightmostNum1 = num1%10;
            int rightmostNum2 = num2%10;
            int rightmostNum3 = num3%10;
            if ((rightmostNum1==rightmostNum2) || (rightmostNum2==rightmostNum3) || (rightmostNum1==rightmostNum3)) {
                return true;
            }
        }
        return false;
    }
    public static boolean isValid (int param1) {
        if ((param1>=10) && (param1<=1000)){
            return true;
        }
        return false;
    }
}
