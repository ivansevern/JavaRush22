package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }

        int[] array1 = new int[10];
        int[] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array1[i] = array[i];
            array2[i] = array[i+10];
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(array2[i]);
        }

        /*int[] array = new int[20];
        int[] b = new int[10];
        int[] c = new int[10];
        for (int i = 0; i < 20; i++) {
            array[i] = Integer.parseInt(reader.readLine());
        }
        for (int i = 0; i < 10; i++) {
            b[i] = array[i];
            c[i] = array[i + 10];
            System.out.println(c[i]);
        }*/
    }
}
