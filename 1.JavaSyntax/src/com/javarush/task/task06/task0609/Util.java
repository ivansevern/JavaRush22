package com.javarush.task.task06.task0609;

/*
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        //write this code
        int dx = x2 - x1;
        int dy = y2 - y1;
        return Math.sqrt(dx * dy + dx * dy);
    }

    public static void main(String[] args) {

    }
}
