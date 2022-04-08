package com.javarush.task.task04.task0437;

/*
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        int a = 10;
        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('8');
            }
            System.out.println();
        }
    }
}
