package com.epam.basics.branching;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 2. Найти max{min(a, b), min(c, d)}.
 */
public class Task2 {
    public static void main(String[] args) {
        int a = ConsoleReader.readIntValue("Enter a: ");
        int b = ConsoleReader.readIntValue("Enter b: ");
        int c = ConsoleReader.readIntValue("Enter c: ");
        int d = ConsoleReader.readIntValue("Enter d: ");
        int max = maxValue(a, b, c, d);
        ResultPrinter.printInt("\nmax(min(a,b), min(c,d)) = ", max);
    }

    public static int maxValue(int a, int b, int c, int d) {
        return Math.max(Math.min(a, b), Math.min(c, d));
    }
}
