package com.javarush.task.task09.task0925;

/*
Статики на своем месте
*/

public class Solution {
    public static int A = 5;      //public int -> public static int
    public static int B = 2 * A;  //public int -> public static int
    public int C = A * B;
    public static int D = A * B;  //public int -> public static int

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.A = 5;

        solution.D = 5;
    }

    public int getA() {
        return A;
    }
}