package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для desktop приложения:
 * которая преобразует номер дня недели в его словесный аналог, если известно:
 *
 * @param weekDayNumber - номер дня недели
 * @return день недели на английском языке (lower case)
 */
public class Task04 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int weekdayNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        System.out.println(getNameWeekday(weekdayNumber));
    }

    static String getNameWeekday(int weekdayNumber) {
        if (weekdayNumber == 1) {
            return "monday";
        } else if (weekdayNumber == 2) {
            return "tuesday";
        } else if (weekdayNumber == 3) {
            return "wednesday";
        } else if (weekdayNumber == 4) {
            return "thursday";
        } else if (weekdayNumber == 5) {
            return "friday";
        } else if (weekdayNumber == 6) {
            return "saturday";
        } else if (weekdayNumber == 7) {
            return "sunday";
        }
        return null;
    }

}