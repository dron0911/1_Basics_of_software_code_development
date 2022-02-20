package com.epam.basics.cycles;

import com.epam.basics.Util.ConsoleReader;

/**
 * 2. Вычислить значения функции на отрезке [а,b] c шагом h:
 */
public class Task2 {
    public static void main(String[] args) {
        int a = ConsoleReader.readIntValue("Enter a:");
        int b = ConsoleReader.readIntValue("Enter b:");
        int h = ConsoleReader.readIntValue("Enter h:");
        solveFunction(a, b, h);
    }

    private static void solveFunction(int a, int b, int h) {
        for (int x = a; x < b; x += h) {
            System.out.println("y = " + (x > 2 ? x : -x) + "x = " + x);
        }
    }
}
