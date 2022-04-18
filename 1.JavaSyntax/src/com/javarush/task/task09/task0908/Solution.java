package com.javarush.task.task09.task0908;

/*
Исключение при работе со строками
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ващ код
        try {
            String s = null;
            String m = s.toLowerCase();
        //напишите тут ващ код
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }
}
