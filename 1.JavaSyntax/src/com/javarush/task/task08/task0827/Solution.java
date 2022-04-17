package com.javarush.task.task08.task0827;

import java.util.Date;

/*
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date currentDate = new Date();
        Date startDate = new Date();
        startDate.setDate(1);
        startDate.setMonth(0);
        long time = currentDate.getTime() - startDate.getTime();
        long days = time / 24 / 60 / 60000 + 1;
        return days % 2 == 1;
    }
}
