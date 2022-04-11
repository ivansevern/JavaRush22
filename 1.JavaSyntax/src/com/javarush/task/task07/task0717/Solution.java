package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/*
Удваиваем слова
 */

public class Solution {
    public static void main(String[] args) throws Exception {
        //read strings c консоли и объявить ArrayList тут
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> strings = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        ArrayList<String> result = doubleValues(strings);
        //вывести на экран result
        for (String string : result) {
            System.out.println(string);
        }
    }

    public static ArrayList<String> doubleValues(ArrayList<String> list) {
        //write this code
        ArrayList<String> result = new ArrayList<>();
        for (String string : list) {
            result.add(string);
            result.add(string);
        }
        return result;
    }
}
