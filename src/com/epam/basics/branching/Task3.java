package com.epam.basics.branching;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
public class Task3 {
    public static void main(String[] args) {
        int x1 = ConsoleReader.readIntValue("Enter x1");
        int y1 = ConsoleReader.readIntValue("Enter xy");
        int x2 = ConsoleReader.readIntValue("Enter x2");
        int y2 = ConsoleReader.readIntValue("Enter y2");
        int x3 = ConsoleReader.readIntValue("Enter x3");
        int y3 = ConsoleReader.readIntValue("Enter y3");
        boolean result = isPointsOnOneLine(x1, y1, x2, y2, x3, y3);
        ResultPrinter.printString(result, "Points in one line", "Points isn't on one line");
    }

    public static Boolean isPointsOnOneLine(int x1, int y1, int x2, int y2, int x3, int y3) {
        return x1 == x2 && x1 == x3 || y1 == y2 && y1 == y3;
    }
}
