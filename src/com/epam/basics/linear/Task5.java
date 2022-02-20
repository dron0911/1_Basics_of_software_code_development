package com.epam.basics.linear;

import com.epam.basics.Util.ConsoleReader;
import com.epam.basics.Util.ResultPrinter;

/**
 * 5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах. Вывести
 * данное значение длительности в часах, минутах и секундах в следующей форме:
 * ННч ММмин SSc.
 */
public class Task5 {
    final static int SEC_IN_HOUR = 3600;
    final static int SEC_IN_MIN = 60;

    public static void main(String[] args) {
        int totalSeconds = ConsoleReader.readIntValue("Enter count of seconds");
        String time = formattedTime(totalSeconds);
        ResultPrinter.printString(time);
    }

    private static String formattedTime(int sec) {
        int hours = sec / SEC_IN_HOUR;
        int temp = sec - (hours * SEC_IN_HOUR);
        int minutes = temp / SEC_IN_MIN;
        int seconds = temp - (minutes * SEC_IN_MIN);
        return String.format("%sh %smin %ss", hours, minutes, seconds);
    }
}
