package com.javarush.task.task04.task0420;
//TODO: ввод 3 чисел и вывод по убыванию

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Сортировка трех чисел
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        if (a <= b && a <= c) {
            if (b <= c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        } else if (b <= a && b <= c) {
            if (b <= c) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        } else {
            if (a <= b) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }
       /* if (a <= b & a <= c) {
            System.out.println(c + " " + b + " " + a);
        } else if (a <= c & c <= b) {
            System.out.println(b + " " + c + " " + a);
        } else if (b <= a & a <= c) {
            System.out.println(c + " " + a + " " + b);
        } else if (b <= c & c <= a) {
            System.out.println(a + " " + c + " " + b);
        } else if (c <= b & b <= a) {
            System.out.println(a + " " + b + " " + c);
        } else if (c <= a & a <= b) {
            System.out.println(b + " " + a + " " + c);
        }*/


    }
}
