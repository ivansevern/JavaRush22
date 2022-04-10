package com.javarush.task.task07.task0704;
//TODO: заполнение массива и вывод в обратном порядке

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переверни массив
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        int[] num = new int[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }
    }
}
