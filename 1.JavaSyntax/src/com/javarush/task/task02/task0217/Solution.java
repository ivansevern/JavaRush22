package com.javarush.task.task02.task0217;

/*
Минимум четырех чисел
*/

public class Solution {
    public static int min(int a, int b, int c, int d){
        //write this code
        //вызов метода min(a, b) вернет min из a и b
        //вызов метода min(c, d) вернет min из c и d
        //результат min(a, b) и min(c, d) вернет min из a, b, c, d
        return min(min(a, b), min(c, d));
    }
    public static int min(int a, int b){
        //write this code
        if (a<b)       //если истина
            return a;  //возвращаем a
        else return b; //иначе возвращаем b
    }

    public static void main(String[] args) {
        System.out.println(min(-20, -10));
        System.out.println(min(-40,-10, -30,40));
        System.out.println(min(-20,-40, -30,40));
        System.out.println(min(-20,-10, -40,40));
        System.out.println(min(-20,-10, -30,-40));
    }
}
