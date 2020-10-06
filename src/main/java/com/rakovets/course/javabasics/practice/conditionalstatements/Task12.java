package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 *
 * @param day   - число дня рождения
 * @param month - месяц дня рождения
 * @param year  - год дня рождения
 * @return 'Zodiac Sign: {0}. Chinese Zodiac: {1}', где {0} - знак зодиака, {1} - год зодиака
 */
public class Task12 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int day = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[0]);
        int month = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[1]);
        int year = (args.length != 3) ? scanner.nextInt() : Integer.parseInt(args[2]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)

        System.out.println(getZodiac(day, month));

    }

    static String getChineseZodiac(int year) {
        int zodiac = year % 2020;
        return null;
    }

    static String getZodiac(int day, int month) {


        switch (month) {
            case 1: {
                if (day>= 21){
                    return "Water-Bearer";
                } else return "Sea-Goat";
            }
            case 2: {
                if (day >= 20){
                    return "Fishes";
                } else return "Water-Bearer";
            }
            case 3: {
                if (day >= 21){
                    return "Ram";
                } else return "Fishes";
            }
        }
        return null;
    }
}
