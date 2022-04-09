package com.javarush.task.task06.task0608;

/*
Статические методы для кошек
*/

public class Cat {
    private static int catCount = 0;

    public static int getCatCount() {
        //write this code
        return catCount;
    }

    public static void setCatCount(int catCount) {
        //write this code
        Cat.catCount = catCount;
    }

    public static void main(String[] args) {

    }
}
