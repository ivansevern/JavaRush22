package com.javarush.task.task07.task0721;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимаксы в массивах
 */

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = getInts();
        int maximum = numbers[0];
        int minimum = numbers[0];
        //write this code
        for (int i = 0; i < numbers.length; i++) {
          //  numbers[i] = Integer.parseInt(reader.readLine());
            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }
            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }
        }
        System.out.println(maximum + " " + minimum);
    }
    //write this code
    public static int[] getInts() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[20];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }
        return  numbers;
    }
}
