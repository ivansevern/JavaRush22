package com.javarush.task.task02.task0218;

/*
Повторенье-мать
*/

public class Solution {
    public static void print3(String text){
        //write this code
        //так
       System.out.println(text);
       System.out.println(text);
       System.out.println(text);

        /* или так
        for (int i = 1; i <= 3 ; i++)
            System.out.println(text);
            */

    }

    public static void main(String[] args) {
        print3("I love you");
    }
}
