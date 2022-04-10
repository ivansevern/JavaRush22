package com.javarush.task.task07.task0702;
//TODO: создание массива и вывод содержимого в обратном порядке

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
Массив строчек в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //write this code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //2 ввод с клавиатуры
        String[] array = new String[10]; //создаю массив
        for (int i = 0; i < 8; i++) {  //с клав циклом заполняю массив
            array[i] = reader.readLine();
        }
        for (int i = 9; i >= 0 ; i--) {
            System.out.println(array[i]);
        }

       /* for (int i = array.length - 1; i >= 0; i--) {   //циклом вывожу
            System.out.println(array[i]);
        }*/
    }
}

