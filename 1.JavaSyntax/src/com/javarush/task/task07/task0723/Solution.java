package com.javarush.task.task07.task0723;

/*
Обратный отсчет I Java Syntax: 7 урровень, 12 лекция
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 30; i >= 0; i--) {
            System.out.println(i);
            //напишите тут ваш код
            try {
                Thread.sleep(100);
            } catch (InterruptedException ignore) {
            }
        }

        System.out.println("Бум!");
    }
}
