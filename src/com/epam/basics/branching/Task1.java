package com.epam.basics.branching;

import com.epam.basics.Util.ConsoleReader;

/**
 * 1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник, и если да, то будет ли
 * он прямоугольным.
 * */
public class Task1 {
    public static void main(String[] args) {
        int a = ConsoleReader.readIntValue("Enter angle a: ");
        int b = ConsoleReader.readIntValue("Enter angle b: ");
        isTriangleExist(a, b);
    }

    public static void isTriangleExist(int a, int b) {
        if (a + b + (180 - a - b) >= 180 || a < 0 || b < 0 || (180 - a - b) < 0) {
            System.out.println("There is no such triangle");
        } else {
            System.out.println("Triangle is exists");
            if (a == 90 || b == 90 || (180 - a - b) == 90) {
                System.out.println("Right triangle");
            } else {
                System.out.println("Triangle is not right");
            }
        }
    }
}
