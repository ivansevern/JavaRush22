package com.javarush.task.task04.task0408;

/*
Хорошо или плохо?
*/

public class Solution {
    public static void main(String[] args) {
        compare(3);
        compare(6);
        compare(5);
    }

    public static void compare(int number) {
        //write this code
        if (number<5)
            System.out.println("ЧИСЛО МЕНЬШЕ 5");
       else if (number>5)
            System.out.println("ЧИСЛО БОЛЬШЕ 5");
       else {
            System.out.println("ЧИСЛО РАВНО 5");
        }
    }
}
