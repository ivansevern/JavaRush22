package com.javarush.task.task05.task0531;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Совершенствуем функциональность
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(reader.readLine());
        int secondNumber = Integer.parseInt(reader.readLine());
        int thirdNumber = Integer.parseInt(reader.readLine());
        int fourthNumber = Integer.parseInt(reader.readLine());
        int fifthNumber = Integer.parseInt(reader.readLine());

        int minimum = min(firstNumber, secondNumber, thirdNumber, fourthNumber, fifthNumber);
        System.out.println("Minimum = " + minimum);
    }

    public static int min(int firstNumber, int secondNumber, int thirdNumber, int fourthNumber, int fifthNumber) {
        return min(min(firstNumber, secondNumber), min(min(thirdNumber, fourthNumber), fifthNumber));
    }

    public static int min(int firstNumber, int secondNumber) {
        return firstNumber < secondNumber ? firstNumber : secondNumber;
    }

    /*public static int min(int a, int b, int c, int d, int e) {
        int m = a;
        if (a >= b) m = b;
        if (m >= c) m = c;
        if (m >= d) m = d;
        if (m >= e) m = e;
        return m;
    }*/
}


/*
public static int min(int a, int b, int c, int d, int e) {
return min(min(a, b), min(c, d), e));
}
public static int min(int a, int b, int c, int d, int e) {
return a<b ? a:b;
}
}
 */
      /*  BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        int minimum = min(a, b);
        System.out.println("Minimum = " + minimum);
    }
    public static int min(int a, int b) {
        return a<b ? a:b;
    }*/
