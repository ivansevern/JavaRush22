package com.javarush.task.task04.task0416;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Переходим дорогу вслепую
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double t = Double.parseDouble(reader.readLine());
        t = t % 5;                                           // режим делим на 5 минут
        if (t >= 0 && t < 3) {                               // если от 0 до 3 минут то горит зеленый
            System.out.println("зелёный");
        } else if (t >= 3 && t < 4) {
            System.out.println("желтый");
        } else {
            System.out.println("красный");
        }
    }
}
