package com.javarush.task.task09.task0911;

/*
Исключение при работе с коллекциями Map
*/

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        try {
            HashMap<String, String> map = new HashMap<>();
            map.put(null, null);
            map.remove(null);
            //напишите тут ваш код
        } catch (NullPointerException e) {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
