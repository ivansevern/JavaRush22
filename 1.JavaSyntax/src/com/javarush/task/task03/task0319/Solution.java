package com.javarush.task.task03.task0319;
//TODO: ввод чисел с клав
/**
 * Enter from the keyboard separately Name, number
 * display to screen
 * Имя получает число1 через число2 лет
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        System.out.println(name + " получает " + n1 + " чеез " + n2 + " лет ");
    }
}
