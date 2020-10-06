package com.rakovets.course.javabasics.practice.conditionalstatements;

import java.util.Scanner;

/**
 * Разработать программу для сайта посвященного астрологии:
 * Которая выводит знак зодиака и названия года по китайскому календарю, если известно:
 * <p>
 * 21.3-20.4 - `Ram`
 * 21.4-20.5 - `Bull`
 * 21.5-21.6 - `Twins`
 * 22.6-22.7 - `Crab`
 * 23.7-22.8 - `Lion`
 * 23.8-21.9 - `Maiden`
 * 22.9-22.10 - `Scales`
 * 23.10-22.11 - `Scorpion`
 * 23.11-21.12 - `Archer`
 * 22.12-20.1 - `Goat`
 * 21.1-19.2 - `Water-bearer`
 * 20.2-20.3 - `Fish`
 * <p>
 * 2001 - `Snake`
 * 2002 - `Horse`
 * 2003 - `Ram`
 * 2004 - `Monkey`
 * 2005 - `Rooster`
 * 2006 - `Dog`
 * 2007 - `Pig`
 * 2008 - `Rat`
 * 2009 - `Ox`
 * 2010 - `Tiger`
 * 2011 - `Rabbit`
 * 2012 - `Dragon`
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

        System.out.println("Zodiac Sign: " + getZodiac(day, month) + "." + " Chinese Zodiac: " + getChineseZodiac(year));

    }

    static String getChineseZodiac(int year) {
        if (year == 2001 || (year - 2001) % 12 == 0) {
            return "Snake";
        } else if (year == 2002 || (year - 2002) % 12 == 0) {
            return "Horse";
        } else if (year == 2003 || (year - 2003) % 12 == 0) {
            return "Ram";
        } else if (year == 2004 || (year - 2004) % 12 == 0) {
            return "Monkey";
        } else if (year == 2005 || (year - 2005) % 12 == 0) {
            return "Rooster";
        } else if (year == 2006 || (year - 2006) % 12 == 0) {
            return "Dog";
        } else if (year == 2007 || (year - 2007) % 12 == 0) {
            return "Pig";
        } else if (year == 2008 || (year - 2008) % 12 == 0) {
            return "Rat";
        } else if (year == 2009 || (year - 2009) % 12 == 0) {
            return "Ox";
        } else if (year == 2010 || (year - 2010) % 12 == 0) {
            return "Tiger";
        } else if (year == 2011 || (year - 2011) % 12 == 0) {
            return "Rabbit";
        } else if (year == 2012 || (year - 2012) % 12 == 0) {
            return "Dragon";
        } else
            return null;
    }

    static String getZodiac(int day, int month) {
        switch (month) {
            case 1: {
                if (day >= 21) {
                    return "Water-bearer";
                } else return "Goat";
            }
            case 2: {
                if (day >= 20) {
                    return "Fish";
                } else return "Water-bearer";
            }
            case 3: {
                if (day >= 21) {
                    return "Ram";
                } else return "Fish";
            }
            case 4: {
                if (day >= 21) {
                    return "Bull";
                } else return "Ram";
            }
            case 5: {
                if (day >= 21) {
                    return "Twins";
                } else return "Bull";
            }
            case 6: {
                if (day >= 22) {
                    return "Crab";
                } else return "Twins";
            }
            case 7: {
                if (day >= 23) {
                    return "Lion";
                } else return "Crab";
            }
            case 8: {
                if (day >= 23) {
                    return "Maiden";
                } else return "Lion";
            }
            case 9: {
                if (day >= 22) {
                    return "Scales";
                } else return "Maiden";
            }
            case 10: {
                if (day >= 23) {
                    return "Scorpion";
                } else return "Scales";
            }
            case 11: {
                if (day >= 23) {
                    return "Archer";
                } else return "Scorpion";
            }
            case 12: {
                if (day >= 22) {
                    return "Goat";
                } else return "Archer";
            }
        }
        return null;
    }
}
