package com.mendonca;

import java.text.DecimalFormat;

public class AreaCalculator {

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        double areaCircle = radius * radius * Math.PI;
        DecimalFormat df = new DecimalFormat(".####");
        return Double.parseDouble(df.format(areaCircle));

    }
    public static double area(double x, double y) {
        if ((x < 0) || (y < 0)) {
            return -1.0;
        }
        double areaRectangle = x * y;
        return areaRectangle;
    }
}
