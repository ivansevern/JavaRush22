package com.javarush.task.task04.task0441;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Как-то средненько
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        if ((a >= b && a <= c) || (a <= b && a >= c)) {
            System.out.println(a);
        } else if ((b >= a && b <= c) || (b <= a && b >= c)) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }

        /*if (a <= b && b <= c) {
            System.out.println(b);
        } else if (a <= c && c <= b) {
            System.out.println(c);
        } else if (b <= a && a <= c) {
            System.out.println(a);
        } else if (b <= c && c <= a) {
            System.out.println(c);
        } else if (c <= a && a <= b) {
            System.out.println(a);
        } else if (c <= b && b <= a) {
            System.out.println(b);
        }*/

    }
}
