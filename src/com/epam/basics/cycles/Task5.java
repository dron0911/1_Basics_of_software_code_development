package com.epam.basics.cycles;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
 * заданному е. Общий член ряда имеет вид:
 */
public class Task5 {
    public static void main(String[] args) {
        int n = ConsoleReader.readIntValue("Enter n: ");
        int e = ConsoleReader.readIntValue("Enter e: ");
        double sum = sumValues(n, e);
        ResultPrinter.printDouble("sum = ", sum);
    }

    private static double sumValues(int n, double e) {
        double sum = 0;
        for (int i = 1; i < n; i++) {
            double a = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
            if (Math.abs(a) >= e) {
                sum += a;
            }
        }
        return sum;
    }
}
