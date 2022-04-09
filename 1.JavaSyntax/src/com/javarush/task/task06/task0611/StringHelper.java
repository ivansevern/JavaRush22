package com.javarush.task.task06.task0611;

/*
Класс StringHelper
*/

public class StringHelper {
    public static String multiply(String text) {
        //write this code
        return multiply(text,5);
    }

    public static String multiply(String text, int count) {
        //write this code
       StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(text);
        }
        return s.toString();
    }

    public static void main(String[] args) {

    }
}
