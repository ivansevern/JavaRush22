package com.javarush.task.task10.task1005;

/*
Задача №4 на преобразование целых типов
*/

public class Solution {
    public static void main(String[] args) {
//        int a = (byte) 44;
//        int b = (byte) 300;
//        short c = (byte) (b - a);
        int a = 44;
        int b = 300;
        short c = (short) (b - a);

        System.out.println(c);
    }
}