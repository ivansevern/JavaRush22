package com.javarush.task.task04.task0430;
//TODO: ввод чисел от 1-10 циклом while

/*
От 1 до 10
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        int i = 1;        //инициализирую числом 1
        while (i <= 10) {   //если меньше или равно 10
            System.out.println(i); //то выводим отсчет
            i++;                   //от 1 и прибавляем по 1
        }
    }
}
