package com.javarush.task.task01.task0134;

/*
Набираем воду в бассейн
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getVolume(25, 5, 2));
    }

    public static long getVolume(int a, int b, int c) {
        //напишите тут ваш код
        return 1000L * a * b * c; //в 1 куб.м. 1000 литров, преобразуем 1000 в лонг
    }
}
