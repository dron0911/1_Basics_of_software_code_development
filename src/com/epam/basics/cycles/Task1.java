package com.epam.basics.cycles;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
 * все числа от 1 до введенного пользователем числа.
 */
public class Task1 {
    public static void main(String[] args) {
        int number = ConsoleReader.readIntValue("Enter your number n");
        int sum = sumOfNumbers(number);
        ResultPrinter.printInt("Sum of numbers from 1 to n = ", sum);
    }

    private static int sumOfNumbers(int number) {
        int sum = 0;
        if (number > 0) {
            for (int i = 1; i <= number; i++) {
                sum += i;
            }
        } else {
            for (int i = 1; i >= number; i--) {
                sum += i;
            }
        }
        return sum;
    }
}
