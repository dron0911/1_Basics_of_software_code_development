package com.epam.basics.linear;

import com.epam.basics.Util.ResultPrinter;

/**
 * 6. Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
 * принадлежит закрашенной области, и false — в противном случае:
 */
public class Task6 {
    public static void main(String[] args) {
        int x = 22;
        int y = -1;
        ResultPrinter.printBoolean(result(x, y));
    }

    public static boolean result(int x, int y) {
        return ((x >= -4 & x <= 4 & y >= -3 & y <= 0) || (x >= -2 & x <= 2 & y <= 4 & y > 0));
    }
}
