package com.javarush.task.task04.task0442;
//TODO: ввод и вывод по нажатию цифры

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Суммирование
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        while (true) {
            int a = Integer.parseInt(reader.readLine());
            sum += a;
            if (a == -1) {
                break;
            }
        }
        System.out.println(sum);
    }
}
