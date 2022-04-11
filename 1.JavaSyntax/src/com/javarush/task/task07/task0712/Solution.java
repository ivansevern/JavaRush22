package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/*
Самые-самые
 */

public class Solution {
    public static void main(String[] args) throws Exception{
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<String>();

        for (int i = 0; i < 10; i++) {
            String string = reader.readLine();
            strings.add(string);
        }

        String minSizeElement = strings.get(0);
        int posMinElement = 0;
        String maxSizeElement = strings.get(0);
        int posMaxElement = 0;
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() < minSizeElement.length()) {
                minSizeElement = strings.get(i);
                posMinElement = i;
            } else if (strings.get(i).length() > maxSizeElement.length()) {
                maxSizeElement = strings.get(i);
                posMaxElement = i;
            }
        }

        if (posMinElement < posMaxElement) {
            System.out.println(minSizeElement);
        } else {
            System.out.println(maxSizeElement);
        }

        /*for (int i = 0; i < 10; i++) {
            strings.add(reader.readLine());
        }
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list1.add(strings.get(i).length());
        }
        Collections.sort(list1);
        int min = list1.get(0);
        int max = list1.get(list1.size() - 1);
        for (int i = 0; i < 10; i++) {
            if (strings.get(i).length() == min) {
                System.out.println(strings.get(i));
                break;
            }
            else if (strings.get(i).length() == max){
                System.out.println(strings.get(i));
                break;
            }
        }*/
    }

}
