package com.javarush.task.task04.task0412;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Положительное и отрицательное число
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        if (a > 0) {         //если положительное
            a *= 2;          //то умножаем число на 2
        } else if (a < 0) {  //если отрицательное
            a += 1;          //то прибавляем к числу 1
        }
        System.out.println(a);
    }
}
