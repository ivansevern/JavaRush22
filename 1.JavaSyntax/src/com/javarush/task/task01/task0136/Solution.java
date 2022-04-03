package com.javarush.task.task01.task0136;

/*
Да хоть на луну
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(getWeight(888));
    }

    public static double getWeight(int earthWeight) {
        //напишите тут ваш код
        double moonWeight = 0.17 * earthWeight; //объявляем переменнную и присваиваем значение по формуле
        return moonWeight; //возвращаем значение переменной, как результат работы метода
    }
}
