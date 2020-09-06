package com.mendonca;

public class BuildingString {
    public static void main(String[] args) {
        String string = "Duck";
        buildAString(string);
    }

    private static void buildAString(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.append("123");
        System.out.println(sb.toString());
        sb.delete(0, 4);
        System.out.println(sb.toString());
        sb.reverse();
        System.out.println(sb.toString());
        sb.deleteCharAt(0);
        System.out.println(sb.toString());
    }

}
