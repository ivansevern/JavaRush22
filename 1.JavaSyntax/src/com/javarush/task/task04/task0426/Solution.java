package com.javarush.task.task04.task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Ярлыки и числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());

        if (a == 0) {
            System.out.println("ноль");
        } else if (a > 0 && a % 2 == 0) {
            System.out.println("Положительное четное число");
        } else if (a > 0 && a % 2 != 0) {
            System.out.println("Положительное нечетное число");
        } else if (a < 0 && a % 2 == 0) {
            System.out.println("Отрицательное четное число");
        } else if (a < 0 && a % 2 != 0) {
            System.out.println("Отрицательное нечетное число");
        }

        /*if (a < 0 && a % 2 == 0) {
            System.out.println("Отрицательное число");
        } else if (a < 0 && a % 2 != 0) {
            System.out.println("Отрицательное нечетное число");
        } else if (a == 0) {
            System.out.println("ноль");
        } else if (a > 0 && a % 2 == 0) {
            System.out.println("Положительное четное число");
        } else if (a > 0 && a % 2 != 0) {
            System.out.println("Положительное нечетное число");
        }*/
    }
}
