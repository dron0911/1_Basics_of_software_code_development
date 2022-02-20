package com.epam.basics.cycles;

import java.math.BigInteger;

/**
 * 4. Составить программу нахождения произведения квадратов первых двухсот чисел.
 */
public class Task4 {
    public static void main(String[] args) {
        BigInteger value = BigInteger.ONE;
        for (int i = 2; i <= 200; i++) {
            value = value.multiply(BigInteger.valueOf((long) i * i));
        }
        System.out.println(value);
    }
}
