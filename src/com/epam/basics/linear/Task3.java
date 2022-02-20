package com.epam.basics.linear;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */
public class Task3 {
    public static void main(String[] args) {
        double x = ConsoleReader.readDoubleValue("Enter x in degrees ");
        double y = ConsoleReader.readDoubleValue("Enter y in degrees ");
        ResultPrinter.printDouble("F = ", resultFunction(x, y));
    }

    private static double resultFunction(double x, double y) {
        double radX = Math.toRadians(x);
        double radY = Math.toRadians(y);
        double temp = Math.cos(radX) - Math.sin(radY);
        if (temp == 0) {
            throw new RuntimeException("Error! Denominator shouldn't be equal 0");
        } else {
            return ((Math.sin(radX) + Math.cos(radY)) / temp) * Math.tan(radX * radY);
        }
    }
}
