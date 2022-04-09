package com.javarush.task.task05.task0528;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
Вывести на экран сегодняшнюю дату
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MM yyyy"); //Вызов даты в формате:
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
