package com.javarush.task.task03.task0303;

/*
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //write this code
        double usd1 = convertEurToUsd(100, 0.8);
        double usd2 = convertEurToUsd(200, 0.8);
        System.out.println(usd1);
        System.out.println(usd2);
    }

    public static double convertEurToUsd(int eur, double exchangeRate){
        //write this code
        return eur * exchangeRate;
    }
}
