package com.javarush.task.task07.task0707;
//TODO: добавление строк в ArrayList
import java.util.ArrayList;

/*
Что за список такой
 */

public class Solution {
    public static void main(String[] args) {
        //write this code
        ArrayList<String> list = new ArrayList<>();
        list.add("первая строка");
        list.add("вторая строка");
        list.add("третья строка");
        list.add("четвертая строка");
        list.add("пятая строка");

        System.out.println(list.size());

        for (String string : list) {
            System.out.println(string);
        }

       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
    }
}