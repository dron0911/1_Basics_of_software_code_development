package com.epam.basics.linear;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
 */
public class Task2 {
    public static void main(String[] args) {
        double a = ConsoleReader.readDoubleValue("Enter a ");
        double b = ConsoleReader.readDoubleValue("Enter b ");
        double c = ConsoleReader.readDoubleValue("Enter c ");
        double result = findValueOfExpression(a, b, c);
        ResultPrinter.printDouble("F = ", result);
    }

    private static double findValueOfExpression(double a, double b, double c) {
        double temp = Math.sqrt(b * b + 4 * a * c);
        double result = 0;
        if (temp >= 0 && a > 0) {
            result = ((b + temp) / 2 * a) - a * a * a * c + Math.pow(b, -2);
        } else {
            throw new RuntimeException("Error! 'a' shouldn't be equal 0 and root value shouldn't be negative");
        }
        return result;
    }


}
