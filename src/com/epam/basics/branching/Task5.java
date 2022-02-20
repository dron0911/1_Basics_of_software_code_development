package com.epam.basics.branching;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 5. Вычислить значение функции:
 */
public class Task5 {
    public static void main(String[] args) {
        int x = ConsoleReader.readIntValue("Enter x: ");
        ResultPrinter.printDouble("F(x)= ", solveFunction(x));
    }

    public static double solveFunction(int x) {
        return x <= 3 ? x * x - 3 * x + 9 : 1.0 / (x * x * x + 6);
    }
}
