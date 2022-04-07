package com.javarush.task.task04.task0429;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительные и отрицательные числа
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int countPositive = 0;
        int countNegative = 0;                    //обнуляем счетчики

        if (a > 0) {
            countPositive++;
        }             //если положительное для 1
        else if (a < 0) {
            countNegative++;
        }    //если отрицательное ддя 1
        if (b > 0) {
            countPositive++;
        }         //для 2 числа
        else if (b < 0) {
            countNegative++;
        }
        if (c > 0) {
            countPositive++;
        }        //для 3 числа
        else if (c < 0) {
            countNegative++;
        }
        System.out.println("количество отрицательных чисел: " + countNegative);
        System.out.println("количество положительных чисел: " + countPositive);
    }
}
