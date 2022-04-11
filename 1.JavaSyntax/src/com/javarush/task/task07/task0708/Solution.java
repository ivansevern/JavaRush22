package com.javarush.task.task07.task0708;
//TODO: вывод максимально длинных строк ArrayList

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Самая длинная строка
 */

public class Solution {
    private static ArrayList<String> strings;

    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        strings = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }
        int maxLength = strings.get(0).length();
        for (String string : strings) {
            if (string.length() > maxLength) {
                maxLength = string.length();
            }
        }
        for (String string : strings) {
            if (string.length() == maxLength) {
                System.out.println(string);
            }
        }
    }
}

