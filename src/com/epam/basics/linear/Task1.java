package com.epam.basics.linear;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 1. Найдите значение функции: z = ((a – 3) * b / 2) + c.
 */
public class Task1 {
    public static void main(String[] args) {
        int a = ConsoleReader.readIntValue("Enter a ");
        int b = ConsoleReader.readIntValue("Enter b ");
        int c = ConsoleReader.readIntValue("Enter c ");
        double result = findValueOfExpression(a, b, c);
        ResultPrinter.printDouble("Z = ", result);
    }

    private static double findValueOfExpression(int a, int b, int c) {
        return ((a - 3) * b / 2.0) + c;
    }
}
