package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для игрового движка:
 * Игрок при регистрации вводит свою дату рождения и она хранится в формате dd/MM/yyyy.
 * В профиле игрока мы должны месяц выводить не в числовом формате, а в текстовом.
 * Определить название месяца в зависимости от номера.
 *
 * @param monthNumber - номер месяца
 * @return месяц на английском языке (upper case)
 */
public class Task05 {
    public static void main(String[] args) {
        //FIXME
        // Ввод данных осуществляется в Console, для проверки различных вариантов входных параметров

        // Код необходимый для тестирования, не изменять
        Scanner scanner = new Scanner(System.in);
        int monthNumber = (args.length != 1) ? scanner.nextInt() : Integer.parseInt(args[0]);

        //TODO
        // Код, решающий задачу пишем ниже, при этом используяся переменные объявленные выше (их можно изменять)
        // Для проверки решения необходимо запустить @Test для данного class (в директории test)
        System.out.println(getNameMonth(monthNumber));
    }
    static String getNameMonth(int monthNumber) {
        if (monthNumber == 1) {
            return "JANUARY";
        } else if (monthNumber == 2) {
            return "FEBRUARY";
        } else if (monthNumber == 3) {
            return "MARCH";
        } else if (monthNumber == 4) {
            return "APRIL";
        } else if (monthNumber == 5) {
            return "MAY";
        } else if (monthNumber == 6) {
            return "JUNE";
        } else if (monthNumber == 7) {
            return "JULY";
        } else if (monthNumber == 8) {
            return "AUGUST";
        } else if (monthNumber == 9) {
            return "SEPTEMBER";
        } else if (monthNumber == 10) {
            return "OCTOBER";
        } else if (monthNumber == 11) {
            return "NOVEMBER";
        } else if (monthNumber == 12) {
            return "DECEMBER";
        }
        return null;
    }
}