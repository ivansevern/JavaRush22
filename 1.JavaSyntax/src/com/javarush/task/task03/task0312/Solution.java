package com.javarush.task.task03.task0312;

/*
Конвертируем время
*/

public class Solution {
    //write this code
    public static int convertToSeconds(int hour) {
        return hour * 60 * 60;
    }

        public static void main (String[]args){
            //write this code
            System.out.println(convertToSeconds(10));
            System.out.println(convertToSeconds(12));
        }
    }
