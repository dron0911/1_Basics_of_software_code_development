package com.epam.basics.linear;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
 * дробную и целую части числа и вывести полученное значение числа.
 */
public class Task4 {
    public static void main(String[] args) {
        double r = ConsoleReader.readDoubleValue("Enter number R type of nnn.ddd  ");
        System.out.println(replacement(r));
        ResultPrinter.printDouble("changed: ", replacement(r));
    }

    private static double replacement(double r) {
        return (r * 1000) % 1000 + (int) r / 1000.0;
    }
}
