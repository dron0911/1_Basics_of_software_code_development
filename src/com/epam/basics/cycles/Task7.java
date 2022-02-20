package com.epam.basics.cycles;

import com.epam.basics.Util.ConsoleReader;

/**
 * 7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
 * m и n вводятся с клавиатуры.
 */
public class Task7 {
    public static void main(String[] args) {
        int m = ConsoleReader.readIntValue("Enter m: ");
        int n = ConsoleReader.readIntValue("Enter n: ");
        divisorsFunction(m, n);
    }

    private static void divisorsFunction(int m, int n) {
        for (int i = m; i <= n; i++) {
            System.out.print("divisors of " + i + ": ");
            for (int j = 2; j < n; j++) {
                if (i % j == 0 && i != j) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }


}
