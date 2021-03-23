package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(2021, Calendar.MARCH, 23);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result = "";
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1 -> result = "воскресенье";
            case 2 -> result = "понедельник";
            case 3 -> result = "вторник";
            case 4 -> result = "среда";
            case 5 -> result = "четверг";
            case 6 -> result = "пятница";
            case 7 -> result = "суббота";
        }
        return result;
    }
}
