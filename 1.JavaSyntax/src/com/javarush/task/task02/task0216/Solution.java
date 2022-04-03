package com.javarush.task.task02.task0216;

/*
Минимум 3 чисел
*/

public class Solution {
    public static int min(int a, int b, int c){
        //write this code
    /*    int m=a;
        if (b<m)  m=b;
        if (c<m) m=c;
        return m; */

        if (a<=b && a<=c) //если 1 условие истина и 2 условие истина
            return a;     //возвращаем a
       if (c<=b && a>=c)  //иначе если 1 условие истина и 2 условие истина
            return c;     //возвращаем c
        else              //иначе
            return b;     //возвращаем b

    }

    public static void main(String[] args) {
        System.out.println(min(1, 1, 3));
        System.out.println(min(-1, -2, -3));
        System.out.println(min(3, 5, 3));
        System.out.println(min(5, 2, 10));
    }
}
