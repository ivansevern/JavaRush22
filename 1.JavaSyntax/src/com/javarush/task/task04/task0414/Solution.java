package com.javarush.task.task04.task0414;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Количество дней в году
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(reader.readLine());
        int days;
        if (year % 400 == 0) {
            days = 366;
        } else if (year % 100 == 0) {
            days = 365;
        } else if (year % 4 == 0) {
            days = 366;
        } else {
            days = 365;
        }
        System.out.println("количество дней в году: " + days);


        /*if (year%400 == 0 || year%4 == 0 && year%100 !=0 )
            System.out.println("количество дней в году: " + 366);
        else System.out.println("количество дней в году: " + 365);*/
    }
}
