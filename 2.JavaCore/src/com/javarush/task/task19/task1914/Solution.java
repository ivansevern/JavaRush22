package com.javarush.task.task19.task1914;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Решаем пример
 */

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(byteArrayOutputStream));
        testString.printSomething();
        System.setOut(defaultPrintStream);

        String result = byteArrayOutputStream.toString();
        String[] resultArray = result.split(" ");
        int firstNum = Integer.parseInt(resultArray[0]);
        int secondNum = Integer.parseInt(resultArray[2]);
        int arithmeticalResult;

        if (resultArray[1].trim().equals("+"))
            arithmeticalResult = firstNum + secondNum;
        else if (resultArray[1].trim().equals("-"))
            arithmeticalResult = firstNum - secondNum;
        else
            arithmeticalResult = firstNum * secondNum;

        System.out.println(firstNum + " " + resultArray[1] + " " + secondNum + " = " + arithmeticalResult);
    }


    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}