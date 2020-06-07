package com.mendonca;

import org.apache.commons.lang3.StringUtils;

public class Main {

    public static void main(String[] args) {
        String text1 = "ABCDELMNuuXYZ";
        String text2 = "ABCFGLMNrtXYZ";
        String difference = StringUtils.difference(text1, text2);
        System.out.println(difference);
    }
}
