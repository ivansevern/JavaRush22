package com.javarush.task.task06.task0622;

/*
Числа по возрастанию
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader((new InputStreamReader(System.in)));
        // write this code
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int fourthNumber = Integer.parseInt(reader.readLine());
        int fifthNumber = Integer.parseInt(reader.readLine());

        int[] array = new int[]{fifthNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber};
        sort(array);

        for (int x : array) {
            System.out.println(x);
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }


        /*int[] array = new int[5];
        for (int i =0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine()); }
        for (int n = array.length-1; n>0; n--) {
            for (int i = 0; i < n; i++) {
                if (array[i] > array[i+1]) {
                    int sort = array[i];
                    array[i] = array[i+1];
                    array[i+1] = sort;
                }
            }
        }
        for (int i:array) {
            System.out.println(i);
        }*/
    }
}

