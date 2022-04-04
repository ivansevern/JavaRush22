package com.javarush.task.task03.task0314;

/*
Таблица умножения I Java Syntax: 3 уровень, 6 лекция
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        for (int i = 1; i <= 10; i++) { // цикл для строк от 1 до 10
            for (int j = 1; j <= 10; j++) { //цикл для столбцов от 1 до 10
                System.out.print(i * j); //цикл умножения строк на столбцы
                System.out.print(" "); //вставка пробелов
            }
            System.out.println(); //вывод результата цикла для каждой строки
        }
    }
}
