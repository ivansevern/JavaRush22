package com.javarush.task.task04.task0434;

/*
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        int i = 1;          //начинаем с 1
        while (i <= 10) {     //если меньше 10 то начинаем
            int j = 1;       //
            while (j <= 10) {   //
                System.out.print(i * j);   //вывожу строку от 1 до 10
                System.out.print(" ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
