package com.javarush.task.task07.task0706;
//TODO: разделение массива на четные и нечетные числа

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int even = 0;
        int odd = 0;
        int[] countPeople = new int[15];
        for (int i = 0; i < 15; i++) {
            countPeople[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 15; i++) {
            if (i % 2 == 0) {
                even += countPeople[i];
            } else {
                odd += countPeople[i];
            }
        }

        if (even > odd) {
            System.out.println("В домах с четными номерами проживает больше жжителей");
        } else if (odd > even){
            System.out.println("В домах с нечетными номерами проживает больше жителей");
        }
    }
}

