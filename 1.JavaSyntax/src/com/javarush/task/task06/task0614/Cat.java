package com.javarush.task.task06.task0614;


import java.util.ArrayList;

/*
Статические коты
*/

public class Cat {
    // write this code
    public static ArrayList<Cat> cats = new ArrayList<>();

    public Cat() {

    }
    public static void main(String[] args) {
        // write this code
        for (int i = 0; i < 10; i++) {
            cats.add(new Cat());   //
        }
        printCats();
    }
    public static void printCats() {
        // write this code
        for (int i = 0; i < 10; i++) {
            System.out.println(cats.get(i));
        }
    }
}

