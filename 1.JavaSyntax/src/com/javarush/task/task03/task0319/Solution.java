package com.javarush.task.task03.task0319;

/*
Предсказание на будущее
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String money = reader.readLine();
        String years = reader.readLine();
        System.out.println(name + " получает " + money + " через " + years + " лет.");
    }
}
