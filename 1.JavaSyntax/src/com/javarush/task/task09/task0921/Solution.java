package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData() {
        //напишите тут ваш код
        List<Integer> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String string;
            while (true) {
                string = reader.readLine();
                result.add(Integer.parseInt(string));
            }
        } catch (Exception e) {
            for (Integer value : result) {
                System.out.println(value);
            }
        }
    }
}
