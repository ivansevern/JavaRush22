package com.javarush.task.task04.task0427;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Описываем числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a > 0 && a < 10 && a % 2 == 0) {
            System.out.println("четное однозначное число");
        } else if (a > 0 && a < 10 && a % 2 != 0) {
            System.out.println("нечетное однозначное число");
        } else if (a > 9 && a < 100 && a % 2 == 0) {
            System.out.println("четное двузначное число");
        } else if (a > 9 && a < 100 && a % 2 != 0) {
            System.out.println("нечетное двузначное число");
        } else if (a > 99 && a < 1000 && a % 2 == 0) {
            System.out.println("четное трехзначное число");
        } else if (a > 99 && a < 1000 && a % 2 != 0) {
            System.out.println("нечетное трехзначное число");
        }
    }
}
