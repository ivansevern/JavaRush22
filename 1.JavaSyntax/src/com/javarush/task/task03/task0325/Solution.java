package com.javarush.task.task03.task0325;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String salary = reader.readLine();
        String text = "Я буду зарабатывать $" + salary +" в час";
        System.out.println(text);
    }
}
