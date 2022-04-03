package com.javarush.task.task03.task0309;

/*
Сумма 5 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //write tis code
        int sum = 0;
        for (int i = 1; i <= 5; i++) {  //присваиваю значение циклом к переменной sum от 1 до 5
            sum += i;
            System.out.println(sum);
        }
    }
}

     /*   for (int i = 1; i < 6; i++) {
            out = i*(i+1)/2;
            }
      */
