package com.javarush.task.task04.task0432;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Хорошего много не бывает
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int number = Integer.parseInt(reader.readLine());
        while (number > 0) {                //если число больше 0
            System.out.println(str);        //то выводим сообщение
            number--;                       //от введенного числа до 1
        }
    }
}
