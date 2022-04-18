package com.javarush.task.task09.task0910;

/*
Исключение при работе с коллекциями List
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            ArrayList<String> list = new ArrayList<>();
            String s = list.get(18);
            //напишите тут ваш код
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getClass().toString());
        }
    }
}
